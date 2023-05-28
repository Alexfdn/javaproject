package timus;

import java.util.Scanner;

public class task_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int left = 0;

        for(int i = 0; i < m; i++){
            int x = in.nextInt();
            left = left + x - n;
            if(left < 0){
                left = 0;
            }
        }
        System.out.println(left);
    }
}
