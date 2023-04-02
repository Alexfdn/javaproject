package lr2;

import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Example16 {
        public static void main(String[] args) {
            Scanner id = new Scanner(System.in);
            System.out.println("Введите размер массива");
            int size = id.nextInt();
            System.out.println("Размер массива равен " + size);
            int[] nums = new int[size];
            Random random = new Random();
            int minimal = 200;
            for (int i = 0; i < nums.length; i++){
                nums[i] = random.nextInt(200);
                if (nums[i] < minimal){
                    minimal = nums[i];
                }
                System.out.println("Элемент массива ["+i+"] = " + nums[i]);
            }
            System.out.print("Минимальный элемент: " + minimal);
            System.out.println();
            for (int i = 0; i < nums.length; i++){
                if (minimal == nums[i]) {
                    System.out.print("Индекс: " + i + "\t");
                }
            }
        }
    }

