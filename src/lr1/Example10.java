package lr1;

import java.util.Scanner;
import java.time.YearMonth;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой год рождения:");
        int year_born = in.nextInt();
        int year = YearMonth.now().getYear();
        int age = year - year_born;

        System.out.println("Ваш возраст: " + age);
        in.close();

    }
}
