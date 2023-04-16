package lr3;
import java.util.Scanner;
public class Example2 {

    public static int binar(int a)
    {
        if (a == 1)
        {
            return 1;
        }
        return binar(a / 2) * 10 + a % 2;
    }
        public static void main(String[] args)
        {
            int a;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число:");
            a = sc.nextInt();
            Example2 b = new Example2();
            int с = b.binar(a);
            System.out.println(с);
        }

    }

