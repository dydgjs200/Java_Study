package _02_static;

import java.util.ArrayList;
import java.util.Scanner;

public class RectMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Rect> list = new ArrayList<>();

        while(true){
            System.out.println("숫자 입력");
            int ip1 = scanner.nextInt();
            int ip2 = scanner.nextInt();

            if(ip1 == 0 && ip2 == 0) {
                break;
            }

            Rect rect = new Rect(ip1, ip2);
            list.add(rect);
        }

        for(Rect r:list){
            System.out.println(r.cal(r.getWidth(), r.getHeight()));
        }
        System.out.println(list.size() + " " );
    }
}
