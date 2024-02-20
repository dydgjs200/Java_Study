package Generic;

import _01_basic_syntax.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericWildCard {
    public static void printArray(List<?> list){
        for(Object o: list){
            System.out.println("list 원소 " + o);
        }
    }

    public static void main(String[] args) {
        //asList = 일반배열을 list로 반환
        List<String> lis1 = new ArrayList<>(Arrays.asList("1","d","c"));
        printArray(lis1);
        List<Integer> lis2 = new ArrayList<>(Arrays.asList(1,2,3,4));
        printArray(lis2);
    }
}
