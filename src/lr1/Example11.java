package lr1;

import java.time.YearMonth;
import java.util.Scanner;

public class Example11 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите свое имя:");
            String name = in.nextLine();
            System.out.println("Введите свой год рождения:");
            int year_born = in.nextInt();
            int year = YearMonth.now().getYear();
            int age = year - year_born;

            System.out.println(name + " " + age);
            in.close();

        }
    }

