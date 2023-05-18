import java.util.Random;
import java.util.Scanner;

public class A1103324_0512 {
    private static final int PORK_DUMPLINGS = 5000;
    private static final int BEEF_DUMPLINGS = 3000;
    private static final int VEGETABLE_DUMPLINGS = 1000;

    private static int porkDumplingsLeft = PORK_DUMPLINGS;
    private static int beefDumplingsLeft = BEEF_DUMPLINGS;
    private static int vegetableDumplingsLeft = VEGETABLE_DUMPLINGS;

    public static void main(String[] args) {
        int numOfCustomers = getNumOfCustomers();
        Thread[] threads = new Thread[numOfCustomers];

        for (int i = 0; i < numOfCustomers; i++) {
            threads[i] = new Thread(new Customer());
            threads[i].start();
            try {
                Thread.sleep(3000); // 等待3秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < numOfCustomers; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("剩餘豬肉水餃數量: " + porkDumplingsLeft);
        System.out.println("剩餘牛肉水餃數量: " + beefDumplingsLeft);
        System.out.println("剩餘蔬菜水餃數量: " + vegetableDumplingsLeft);
    }

    private static synchronized boolean sellDumplings(DumplingType type, int quantity) {
        switch (type) {
            case PORK:
                if (porkDumplingsLeft >= quantity) {
                    porkDumplingsLeft -= quantity;
                    return true;
                }
                break;
            case BEEF:
                if (beefDumplingsLeft >= quantity) {
                    beefDumplingsLeft -= quantity;
                    return true;
                }
                break;
            case VEGETABLE:
                if (vegetableDumplingsLeft >= quantity) {
                    vegetableDumplingsLeft -= quantity;
                    return true;
                }
                break;
        }
        return false;
    }

    private static int getNumOfCustomers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入同時光顧的顧客數目：");
        int numOfCustomers = scanner.nextInt();
        scanner.close();
        return numOfCustomers;
    }

    public static DumplingType getRandomDumplingType() {
        Random random = new Random();
        int rand = random.nextInt(3);
        switch (rand) {
            case 0:
                return DumplingType.PORK;
            case 1:
                return DumplingType.BEEF;
            case 2:
                return DumplingType.VEGETABLE;
            default:
                return DumplingType.PORK;
        }
    }

    public enum DumplingType {
        PORK("豬肉水餃"),
        BEEF("牛肉水餃"),
        VEGETABLE("蔬菜水餃");

        private final String name;

        DumplingType(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private static class Customer implements Runnable {
        public void run() {
            Random random = new Random();
            int quantity = random.nextInt(41) + 10;
            DumplingType type = getRandomDumplingType();

            boolean sold = sellDumplings(type, quantity);
            if (sold) {
                System.out.println("顧客點了 " + quantity + " 個 " + type + " 水餃");
            } else {
                System.out.println("顧客點了 " + quantity + " 個 " + type + " 水餃，但已售完");
            }
        }
    }
}

