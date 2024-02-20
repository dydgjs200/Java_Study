package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();

        long start;
        long end;

        start = System.nanoTime();
        for(int i=0; i<1000000; i++){
            list1.add(i);
        }
        end = System.nanoTime();

        System.out.println("Arraylist 10만번 add 시간 : " + (end - start));

        start = System.nanoTime();
        for(int i=0; i<1000000; i++){
            list2.add(i);
        }
        end = System.nanoTime();

        System.out.println("Linkedlist 10만번 add 시간 : " + (end - start));
    }
}
