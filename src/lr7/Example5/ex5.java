package lr7.Example5;
import java.io.File;
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            long fileSize = file.length();
            System.out.println("Размер файла в байтах: " + fileSize);
        } else {
            System.out.println("Файл не существует.");
        }

        scanner.close();
    }
}

