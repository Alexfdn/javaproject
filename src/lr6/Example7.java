package lr6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Example7 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Джава");
        strings.add("Питон");
        strings.add("Привет");
        strings.add("мир");

        int minLength = 5;
        List<String> filteredStrings = filterStrings(strings, minLength);

        System.out.println("Исходный список: " + strings);
        System.out.println("Итоговый список: " + filteredStrings);
    }

    public static List<String> filterStrings(List<String> strings, int minLength) {
        return strings.stream()
                .filter(str -> str.length() > minLength)
                .collect(Collectors.toList());
    }
}



