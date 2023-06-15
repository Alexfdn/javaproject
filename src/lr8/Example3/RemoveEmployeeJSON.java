package lr8.Example3;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
public class RemoveEmployeeJSON {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/lr8/Example3/example-json.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject division = (JSONObject) jsonParser.parse(reader);
            JSONArray employee = (JSONArray) division.get("employee");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите фамилию сотрудника для удаления: ");
            String surname = scanner.nextLine();

            Iterator iterator = employee.iterator();
            while (iterator.hasNext()) {
                JSONObject emp = (JSONObject) iterator.next();
                if (surname.equals(emp.get("surname"))) {
                    iterator.remove();
                    System.out.println("Сотрудник с фамилией \"" + surname + "\" успешно удален из списка.");
                    break;
                }
            }

            FileWriter file = new FileWriter("src/lr8/Example3/example-json.json");
            file.write(division.toJSONString());
            file.flush();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
