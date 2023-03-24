import java.util.Scanner;

public class A1103324_0317_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入 n：");
        int n = scanner.nextInt();
        System.out.print("請輸入 m：");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        System.out.println("從n到m的二維陣列：");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0) {
                    System.out.print(j + 1 + "\t");
                } else if (j == 0) {
                    System.out.print(i + 1 + "\t");
                } else {
                    System.out.print(arr[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

    
    
    
    
    
    