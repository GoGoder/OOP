import java.util.*;

public class A1103324_0331 {
    public static void main(String[] args) {
        
        Animal.showInfo();
        
        Animal a = new Animal("雪寶", 1.1, 52, 100);
        Animal b = new Animal("驢子", 1.5, 99, 200);
        
        human c = new human("阿克", 1.9, 80, 150, "男");
        human d = new human("漢斯", 1.8, 78, 130, "男");
        human e = new human("安那", 1.7, 48, 120, "女");
        
        snow f = new snow("愛沙", 160, 45, 15, "女", "Yes");
        
        a.show();
        b.show();
        c.show();
        d.show();
        e.show();
        f.show();
        
        Scanner scanner = new Scanner(System.in);
        a.distance();
        b.distance();
        c.distance();
        d.distance();
        e.distance();
        f.distance();

        System.out.println("雪寶跑了 " + a.distance() + " 公尺");
        System.out.println("驢子跑了 " + b.distance() + " 公尺");
        System.out.println("阿克跑了 " + c.distance() + " 公尺"); 
        System.out.println("漢斯跑了 " + d.distance() + " 公尺");
        System.out.println("安那跑了 " + e.distance() + " 公尺");
        System.out.println("愛沙跑了 " + f.distance() + " 公尺");
    }
}