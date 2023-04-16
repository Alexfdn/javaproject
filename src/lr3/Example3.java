package lr3;
import java.util.Scanner;
public class Example3 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер массива: ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            System.out.println("Введите элементы массива:");
            input(array, 0, scanner);
            System.out.println("Введённый массив:");
            output(array, 0);
        }
        private static void input(int[] array, int index, Scanner scanner) {
            if (index == array.length) {
                return;
            }
            array[index] = scanner.nextInt();
            input(array, index + 1, scanner);
        }
        private static void output(int[] array, int index) {
            if (index == array.length) {
                return;
            }
            System.out.print(array[index] + " ");
            output(array, index + 1);
        }
    }
