package lr7.Example1_8;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ex1_8 {public static void main(String[] args) throws IOException {
    FileReader reader = new FileReader("src/LR7/Example1_8/input.txt");
    FileWriter writer = new FileWriter("src/LR7/Example1_8/output.txt");
    int c;
    while ((c = reader.read()) != -1) {
        writer.write(c);
    }
    reader.close();
    writer.close();
    System.out.println("Файл скопирован успешно!");
}
}


