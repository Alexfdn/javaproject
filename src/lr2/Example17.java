package lr2;
import java.util.Scanner;
public class Example17 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.print("введите количество строк массива: ");
            int a =id.nextInt();
            System.out.print("введите количество столбцов массива: ");
            int b = id.nextInt();
            int[][] ArrayZmeyka = new int[a][b];
            int telo = 0;
            for (int i = 0; i < a ; i++) {
                if(i%2==0){
                    for (int j = 0; j < b; j++) {
                        ArrayZmeyka[i][j] = telo;
                        telo++;
                    }
                }
                if(i%2!=0){
                    for (int o=b-1; o >= 0; o--) {
                        ArrayZmeyka[i][o] = telo;
                        telo++;
                    }
                }
            }
            for (int i = 0; i < ArrayZmeyka.length; i++){
                System.out.print("номер строки " + i + " : ");
                for (int j = 0; j < ArrayZmeyka[i].length; j++){
                    System.out.print(ArrayZmeyka[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

