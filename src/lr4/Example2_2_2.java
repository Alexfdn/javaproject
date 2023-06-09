package lr4;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Example2_2_2 {
    public static void main(String[] args) {
        try {
            int[][] matrix = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер столбца: ");
            int columnNumber = scanner.nextInt();

            for (int i = 0; i < matrix.length; i++) {
                System.out.println(matrix[i][columnNumber]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Ввод строки вместо числа");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Нет столбца с таким номером");
        }
    }
}

