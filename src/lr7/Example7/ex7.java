package lr7.Example7;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название файла: ");
        String fileName = scanner.nextLine();

        System.out.print("Введите текст для записи в файл: ");
        String text = scanner.nextLine();

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(text);
            writer.close();

            int charactersWritten = text.length();
            System.out.println("Количество записанных символов: " + charactersWritten);
        } catch (IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        scanner.close();
    }
}

