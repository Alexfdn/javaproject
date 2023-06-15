package lr8.Example2;
import java.io.File;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
public class AddEmployee {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/lr8/Example2/employee.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите Имя работника: ");
            String name = scanner.nextLine();

            System.out.print("Введите Отчество работника: ");
            String patronymic = scanner.nextLine();

            System.out.print("Введите Фамилию работника: ");
            String surname = scanner.nextLine();

            System.out.print("Введите Позицию работника: ");
            String position = scanner.nextLine();

            Element root = doc.getDocumentElement();

            Element employee = doc.createElement("employee");

            Element nameElement = doc.createElement("name");
            nameElement.appendChild(doc.createTextNode(name));
            employee.appendChild(nameElement);

            Element patronymicElement = doc.createElement("patronymic");
            patronymicElement.appendChild(doc.createTextNode(patronymic));
            employee.appendChild(patronymicElement);

            Element surnameElement = doc.createElement("surname");
            surnameElement.appendChild(doc.createTextNode(surname));
            employee.appendChild(surnameElement);

            Element positionElement = doc.createElement("position");
            positionElement.appendChild(doc.createTextNode(position));
            employee.appendChild(positionElement);

            root.appendChild(employee);

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Example2/employee.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
