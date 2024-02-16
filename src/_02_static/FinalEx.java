package _02_static;

import java.util.Scanner;

public class FinalEx {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원 반지름 입력");
        int input = scanner.nextInt();

        FianlExCircle cir = new FianlExCircle(input);
        System.out.println("원 반지름 : " +(double) input);
        System.out.println("원 넓이 : " + cir.cal(input));
    }
}
