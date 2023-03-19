package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int number_first = in.nextInt();
        System.out.println("Введите второе число:");
        int number_second = in.nextInt();
        int sum = number_first + number_second;
        System.out.println(sum);
        in.close();
    }
}

