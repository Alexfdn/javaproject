package lr6;
import java.util.List;
import java.util.stream.Collectors;
public class Example5 {
        public static void main(String[] args) {
            List<String> strings = List.of("Hello", "world", "Java", "Python");

            List<String> filteredStrings = filterStrings(strings, "a");

            System.out.println("Исходный список: " + strings);
            System.out.println("Итоговый список: " + filteredStrings);
        }

        public static List<String> filterStrings(List<String> strings, String substring) {
            return strings.stream()
                    .filter(str -> str.contains(substring))
                    .collect(Collectors.toList());
        }
}



