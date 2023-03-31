import java.util.Scanner;

class Animal{

  String name;
  int height;
  int weight;
  double speed;

  Animal(String name, double height, int weight, double speed) {
    this.name = name;
    this.height = height;
    this.weight = weight;
    this.speed = speed;
}

  void show(){
    System.out.println("名字:"+name);
    System.out.println("身高:"+height);
    System.out.println("體重:"+weight);
    System.out.println("速度:"+speed);

  }    

  double distance(double x, double y){
    double z = x*this.speed*y;
    return z;
  }    
    
    
  double distance(double x){
    x= x*this.speed;
    return x;
  }
}


public class A1103324_0324_1{
  public static void main (String [] args) {
    Animal[] animal = new Animal[4];
    
    for(int i=0;i<4;i++){
      animal[i] = new Animal();  
    }
    animal[0] = new Animal("雪寶", 1.1, 52, 100);
    animal[1] = new Animal("驢子", 1.5, 99, 200);
    animal[2] = new Animal("安那", 1.7, 48, 120);
    animal[3] = new Animal("愛沙", 1.7, 50, 120);

    for (int i = 0; i < animal.length; i++) {
      animal[i].show();
      Scanner scanner = new Scanner(System.in);
      System.out.print(animal[i].name +"的時間:");
      double x = scanner.nextDouble();
      System.out.print(animal[i].name +"的加速度:");
      double y = scanner.nextDouble();
      double z = animal[i].distance(x,y);
      System.out.println(animal[i].name +"的奔跑距離:"+ z);
    }
  }
}

   