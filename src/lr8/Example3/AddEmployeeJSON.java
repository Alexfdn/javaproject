package lr8.Example3;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class AddEmployeeJSON {
    public static void main(String[] args) {
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lr8/Example3/example-json.json"));
            JSONObject jsonObject = (JSONObject) obj;

            JSONArray jsonArray = (JSONArray) jsonObject.get("employee");
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите имя сотрудника: ");
            String name = scanner.nextLine();

            System.out.print("Введите отчество сотрудника: ");
            String patronymic = scanner.nextLine();

            System.out.print("Введите фамилию сотрудника: ");
            String surname = scanner.nextLine();

            System.out.print("Введите должность сотрудника: ");
            String position = scanner.nextLine();

            JSONObject newEmployee = new JSONObject();
            newEmployee.put("name", name);
            newEmployee.put("patronymic", patronymic);
            newEmployee.put("surname", surname);
            newEmployee.put("position", position);
            jsonArray.add(newEmployee);
            JSONObject division = new JSONObject();
            division.put("employee", jsonArray);

            try (FileWriter file = new FileWriter("src/lr8/Example3/example-json.json")) {
                file.write(division.toJSONString());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
