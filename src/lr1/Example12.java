package lr1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите свой возраст:");
        int age = in.nextInt();
        int year = YearMonth.now().getYear();
        int year_born = year - age;

        System.out.println(year_born);
        in.close();
    }

}
