import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Scanner;

public class A1103324_0421_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入日期 (YYYY/MM/DD 或 MM/DD/YYYY): ");
        String inputDate = scanner.nextLine();
        scanner.close();
        
        DateTimeFormatter formatter;
        LocalDate date;
        if (inputDate.matches("\\d{4}/\\d{2}/\\d{2}")) {
            formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            date = LocalDate.parse(inputDate, formatter);
        } else if (inputDate.matches("\\d{2}/\\d{2}/\\d{4}")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            date = LocalDate.parse(inputDate, formatter);
        } else {
            System.out.println("日期格式錯誤！");
            return;
        }
        
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        
        System.out.println("輸入的日期：" + inputDate);
        System.out.println("年：" + year);
        System.out.println("月：" + month);
        System.out.println("日：" + day);

    }
}






