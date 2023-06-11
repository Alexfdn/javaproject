package lr7.Example4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex4 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/LR7/Example4/text.txt");
        FileWriter writer = new FileWriter("src/LR7/Example4/copy.txt");
        int c;
        while ((c = reader.read()) != -1) {
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}

