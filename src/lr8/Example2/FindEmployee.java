package lr8.Example2;
import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
public class FindEmployee {
    public static void searchByPosition(String position) {
        try {
            File inputFile = new File("src/lr8/Example2/employee.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("employee");
            System.out.println("Список сотрудников с позицией " + position + ":");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element employee = (Element) nodeList.item(i);
                String employeePosition = employee.getElementsByTagName("position").item(0).getTextContent();

                if (employeePosition.equalsIgnoreCase(position)) {
                    String surname = employee.getElementsByTagName("surname").item(0).getTextContent();
                    System.out.println(surname);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите позицию для поиска сотрудников: ");
        String searchPosition = scanner.nextLine();
        searchByPosition(searchPosition);
    }
}