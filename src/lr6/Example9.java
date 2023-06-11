package lr6;
import java.util.List;
import java.util.stream.Collectors;
public class Example9 {
    public static void main(String[] args) {
        List<String> strings = List.of("world", "world6543", "Java", "Python.");

        List<String> filteredStrings = filterStrings(strings);

        System.out.println("Исходный список: " + strings);
        System.out.println("Итоговый список: " + filteredStrings);
    }

    public static List<String> filterStrings(List<String> strings) {
        return strings.stream()
                .filter(str -> str.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
