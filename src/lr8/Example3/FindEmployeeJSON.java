package lr8.Example3;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
public class FindEmployeeJSON {
    public static void findEmployee(String position) {
        try {
            FileReader reader = new FileReader("src/lr8/Example3/example-json.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject division = (JSONObject) jsonParser.parse(reader);
            JSONArray employee = (JSONArray) division.get("employee");

            for (int i = 0; i < employee.size(); i++) {
                JSONObject emp = (JSONObject) employee.get(i);
                if (emp.get("position").equals(position)) {
                    System.out.println("Сотрудник найден:");
                    System.out.println("Имя: " + emp.get("name"));
                    System.out.println("Отчество: " + emp.get("patronymic"));
                    System.out.println("Фамилия: " + emp.get("surname"));
                    return;
                }
            }

            System.out.println("Сотрудник с позицией \"" + position + "\" не найден.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название должности: ");
        String position = scanner.nextLine();

        FindEmployeeJSON.findEmployee(position);
    }
}
