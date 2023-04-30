package lr4;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Example2_3_2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Размер массива: ");
            int size = input.nextInt();
            byte array[] = new byte[size];
            System.out.println("Элемент массива:");
            int sum = 0;
            try {
                for (byte i = 0; i < size; i++) {
                    array[i] = input.nextByte();
                    if (i < -128 || i > 127) {
                        throw new NumberFormatException();
                    }
                }
                for (byte i : array) {
                    sum += i;
                }
                System.out.println(sum);
            } catch (NumberFormatException e) {
                System.out.println("ввод значения за границами диапазона типа");
            }
        } catch (InputMismatchException e) {
            System.out.println("ввод строки вместо числа");}
    }
}
