package lr6;
import java.util.stream.Collectors;
import java.util.List;

public class Example6 {
    public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

            List<Integer> filteredNumbers = filterNumbers(numbers, 4);

            System.out.println("Исходный список: " + numbers);
            System.out.println("Итоговый список: " + filteredNumbers);
        }

        public static List<Integer> filterNumbers(List<Integer> numbers, int divider) {
            return numbers.stream()
                    .filter(num -> num % divider == 0)
                    .collect(Collectors.toList());
        }
    }


