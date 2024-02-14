package _01_basic_syntax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class student{
    private String name;
    private int age;

    public student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class ArrayListEX {
    // list 컬렉션은 객체 번지를 저장

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();

        //요소 추가
        arr.add(1);
        arr.add(2);

        for(Integer a : arr){
            System.out.println(a);
        }

        // 요소 가져오기
        System.out.println(arr.get(0));
        System.out.println(arr.getLast());

        // 요소 수정 set(index, number)
        arr.set(1, 49);
        System.out.println(arr.getLast());

        // arrayList끼리 연결
        arr.addAll(Arrays.asList(9, 4, 2, 1));
        System.out.println(arr);

        // 요소 찾기
        System.out.println(arr.indexOf(4));

        // 요소 삭제
        arr.remove(arr.indexOf(4));
        System.out.println(arr);

        // 요소 크기
        System.out.println(arr.size());


        ///////////////
        ArrayList<student> std = new ArrayList<>();
        std.add(new student("john", 10));
        std.add(new student("aaa", 101));

        for(student s:std){
            System.out.println("std > " + s.getAge() + " " + s.getName());
        }


        /////////////

        ArrayList<String> strArr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("문자 입력");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
            else {
                strArr.add(input);
            }
        }

        for(String s:strArr){
            System.out.println(s);
        }
    }
}
