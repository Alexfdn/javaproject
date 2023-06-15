package lr8.Example2;
import java.io.File;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
public class RemoveEmployee {
    public static void removeEmployee(String surname) {
        try {
            File inputFile = new File("src/lr8/Example2/employee.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nodeList = doc.getElementsByTagName("employee");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element employee = (Element) nodeList.item(i);
                String employeeSurname = employee.getElementsByTagName("surname").item(0).getTextContent();

                if (employeeSurname.equalsIgnoreCase(surname)) {
                    employee.getParentNode().removeChild(employee);
                    System.out.println("Сотрудник с фамилией \"" + surname + "\" был успешно удален.");
                }
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("src/lr8/Example2/employee.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите фамилию сотрудника для удаления: ");
        String surname = scanner.nextLine();
        removeEmployee(surname);
    }
}
