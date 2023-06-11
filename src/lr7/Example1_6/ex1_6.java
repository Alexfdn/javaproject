package lr7.Example1_6;
import java.io.*;
public class ex1_6 {
    public static void main(String[] args) {
        String inputFileName = "src/LR7/Example1_6/input.txt";
        String outputFileName = "src/LR7/Example1_6/output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter = new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }

            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}

