package lr3;
import java.util.ArrayList;
import java.util.Scanner;

public class Example6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количетсво: ");
        int n = scanner.nextInt();
        ArrayList<Integer> c = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            c.add(i);
        }
        int index = 0;
        while (c.size() > 1) {
            index = (index + 1) % c.size();
            c.remove(index);
        }
        System.out.println("Остался номер " + c.get(0));
    }
}
