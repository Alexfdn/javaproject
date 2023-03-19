package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int sum = a1 + a2;
        int diff = a1 - a2;
        System.out.println(sum + " " + diff);
        in.close();
    }
}