package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1 = in.nextInt();
        int a2 = a1 - 1;
        int a3 = a1 + 1;
        int a4 = (a1+a2+a3) * (a1+a2+a3);
        System.out.println(a2 + " " + a1 + " " + a3 + " " + a4);
        in.close();

    }

}
