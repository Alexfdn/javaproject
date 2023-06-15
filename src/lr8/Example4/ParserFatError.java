package lr8.Example4;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ParserFatError {
    public static void ParserFat(String url, String fileName) {
        try {
            Document doc = Jsoup.connect(url).get();
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table" +
                    " > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

            StringBuilder content = new StringBuilder();

            for (int i = 3; i < 20; i++) {
                if (!(i % 2 == 0)) {
                    List<Node> nodes = newsParent.get(0).childNodes();
                    String theme = ((Element) nodes.get(i)).getElementsByClass("blocktitle")
                            .get(0).childNodes().get(0).toString();
                    String date = ((Element) nodes.get(i)).getElementsByClass("blockdate")
                            .get(0).childNodes().get(0).toString();

                    content.append("Тема: ").append(theme).append("\n");
                    content.append("Дата: ").append(date).append("\n\n");
                }
            }

            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content.toString());
            fileWriter.close();

            System.out.println("Данные успешно записаны в файл: " + fileName);
        }catch (IOException e) {
            System.err.println("Ошибка при подключении " + url + ", Переподключение");
            e.printStackTrace();
            ParserFat(url, fileName);
        }
    }

    public static void main(String[] args) {

        ParserFat("http://fat.urfu.ru/index.html", "src/lr8/Example4/ParserFat.txt");
    }
}
