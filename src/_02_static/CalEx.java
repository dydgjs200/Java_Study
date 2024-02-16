package _02_static;

public class CalEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        double circleArea = num1 * num2 * Calculator.pi;
        int plusRes = Calculator.plus(num1, num2);

        System.out.println(circleArea);
        System.out.println(plusRes);
    }
}
