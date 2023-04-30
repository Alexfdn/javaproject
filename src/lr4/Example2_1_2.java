package lr4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example2_1_2 {
    static class NegativeNumberException extends Exception {
    }

    public static void main(String args[]) {
        try {
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
                if (counter == 0) {
                    throw new NegativeNumberException();
                }
            }
            System.out.print("Среднее арифметическое чисел равно: " + sum / array.length);
        } catch (NegativeNumberException e) {
            System.out.println("В массиве нет положительных чисел");
        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (NumberFormatException e){
            System.out.println("Несоответствие числового типа данных");
        }
    }
}
