package lr3;
import java.util.HashMap;
public class Example5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            hashMap.put(i, "Значение" + i);
        }
        String result = "";
        int a = 1;
        for (HashMap.Entry<Integer, String> entry : hashMap.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();

            if (key > 5) {
                System.out.println("Ключ: " + key + ", Значение: " + value);
            }
            if (key == 0) {
                result += value + ",";
            }
            if (value.length() > 5) {
                a *= key;
            }
        }
        if (!result.isEmpty()) {
            System.out.println("Ключ = 0: " + result.substring(0, result.length() - 1));
        }
        System.out.println("Ключ > 5: " + a);
    }
}

