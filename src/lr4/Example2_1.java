package lr4;
import java.util.Scanner;
public class Example2_1 {
    public static void main(String args[]) {
            int counter = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Размер массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Элемент массива:");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }
            int sum = 0;
            for (int i : array) {
                if (i > 0) {
                    sum += i;
                    counter += 1;
                }
                }
            System.out.print("Среднее арифметическое чисел равно: " + sum / array.length);
    }
}
