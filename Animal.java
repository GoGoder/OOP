import java.util.*;

public class Animal {
    private String name;
    private double height;
    private double weight;
    private double speed;

    public Animal(String name, double height, double weight, double speed) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Speed: " + speed);
    }

    public double distance() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入時間: "); 
        double x = scanner.nextDouble();
        System.out.print("請輸入加速度(y): ");
        double y = scanner.nextDouble();
        if(y==0){
            y=1;
        }
        scanner.close();
        return x * y * speed;
    }

    public static void showInfo() {
        System.out.println("歡迎進入冰雪奇緣系統!");
    }
}

