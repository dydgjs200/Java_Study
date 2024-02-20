package Collection;

import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("이름 입력");
            String name = sc.next();

            if (name.equals("종료")){
                break;
            }

            System.out.println("나이 입력");
            int age = sc.nextInt();

            map.put(name, age);
        }

        for (Map.Entry<String, Integer> entry:map.entrySet()){
            System.out.println("이름 : " + entry.getKey() + ", 나이 : " + entry.getValue());
        }

    }
}
