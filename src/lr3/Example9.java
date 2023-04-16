package lr3;
import java.util.*;

public class Example9 {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet<>();
        for (int i = 0; i < 8000000; i++) {
            hashSet.add(i);
        }
        SortedSet sortedSet = new TreeSet<>();
        for (int i = 0; i < 8000000; i++) {
            sortedSet.add(i);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 8000000; i++) {
            arrayList.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            hashSet.add(i);
        }
        System.out.println("Время выполнения операции добавления в HashSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sortedSet.add(i);
        }
        System.out.println("Время выполнения операции добавления в SortedSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, i);
        }
        System.out.println("Время выполнения операции добавления в начало ArrayList = " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        System.out.println("Время выполнения операции добавления в конец ArrayList = " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(4000001, i);
        }
        System.out.println("Время выполнения операции добавления в середину ArrayList = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            hashSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из начала HashSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sortedSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из начала SortedSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из начала ArrayList = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 4000001; i < 4010001; i++) {
            hashSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из середины HashSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 4000001; i < 4010001; i++) {
            sortedSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из середины SortedSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 4000001; i < 4010001; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из середины ArrayList = " + (System.currentTimeMillis() - start));


        start = System.currentTimeMillis();
        for (int i = 7990000; i < 8000000; i++) {
            hashSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из конца HashSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 7990000; i < 8000000; i++) {
            sortedSet.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из конца SortedSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 7990000; i < 8000000; i++) {
            arrayList.remove(i);
        }
        System.out.println("Время выполнения операции удаления элемента из конца ArrayList = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            sortedSet.first();}
        System.out.println("Время выполнения операции получения элемента по индексу SortedSet = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);}
        System.out.println("Время выполнения операции получения элемента по индексу ArrayList = " + (System.currentTimeMillis() - start));

        }

    }