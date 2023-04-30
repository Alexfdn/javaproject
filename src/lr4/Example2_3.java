package lr4;
import java.util.Scanner;
public class Example2_3 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Размер массива: ");
            int size = input.nextInt();
            byte array[] = new byte[size];
            System.out.println("Элемент массива:");
            int sum = 0;

                for (byte i = 0; i < size; i++) {
                    array[i] = input.nextByte();

                }
                for (byte i : array) {
                    sum += i;
                }
                System.out.println(sum);
}
}
