package lr1;
import java.util.Scanner;
public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day of week:");
        String day = in.nextLine();

        System.out.println("Input month:");
        String month = in.nextLine();

        System.out.println("Input date:");
        int date = in.nextInt();

        System.out.println("Сегодня: "+ day + " " + date + " " + month);
        in.close();


    }

}
