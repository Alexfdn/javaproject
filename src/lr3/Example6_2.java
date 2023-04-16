package lr3;
import java.util.LinkedList;
import java.util.Scanner;
public class Example6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количетсво: ");
        int n = scanner.nextInt();
        LinkedList<Integer> c = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            c.add(i);
        }
        int index = 0;
        while (c.size() > 1) {
            index = (index + 1) % c.size();
            c.remove(index);
        }
        System.out.println("Остался номеро " + c.get(0));
    }
}