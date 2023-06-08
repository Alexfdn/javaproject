package lr6;
import java.util.List;
import java.util.stream.Collectors;
public class Example8 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 5, 10, 15, 20, 25);
        int minValue = 20;

        List<Integer> filteredNumbers = filterNumbers(numbers, minValue);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Итоговый список: " + filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, int minValue) {
        return numbers.stream()
                .filter(num -> num > minValue)
                .collect(Collectors.toList());
    }
}

