import java.util.Scanner;

public class A1103324_0421_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入電話號碼：");
        String phoneNumber = scanner.nextLine();
        
        if (phoneNumber.matches("\\(\\d{2}\\)-\\d{8}")) {
            System.out.println("輸入的電話號碼格式正確（不規則表示法）！");
        } else {
            System.out.println("輸入的電話號碼格式不正確（不規則表示法）");
        }
        
        if (phoneNumber.matches("\\(0\\d{1,2}\\)\\d{6,8}")) {
            System.out.println("輸入的電話號碼格式正確（規則表示法）！");
        } else {
            System.out.println("輸入的電話號碼格式不正確（規則表示法）");
        }
        


        System.out.print("請輸入電子信箱：");
        String email = scanner.nextLine();

        if (email.matches("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}")) {
            System.out.println("輸入的電子信箱格式正確（規則表示法）！");
        } else {
            System.out.println("輸入的電子信箱格式不正確（規則表示法）");
        }   

        if (email.matches("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")) {
            System.out.println("輸入的電子信箱格式正確（不規則表示法）！");
        } else {
            System.out.println("輸入的電子信箱格式不正確（不規則表示法）");
        }
    }
}




