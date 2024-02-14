package _01_basic_syntax;

import java.util.Scanner;

public class Method {
    public static double cal(int r){
        return r*r*Math.PI;
    }
    public static double cal(int x, int y){
        return x*y;
    }
    public static double cal(double a, double b){
        return (a*b)/2;
    }

//    public static double add(double a, double b){
//        return a+b;
//    }
//    public static double sub(double a, double b){
//        return a-b;
//    }
//    public static double div(double a, double b){
//        return a/b;
//    }
//    public static double mul(int a, int b){
//        return a*b;
//    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.println("반지름 5인 원넓이 : " + cal(5));
        System.out.println("가로 4, 세로 7인 직사각형 넓이 : " + cal(4,7));
        System.out.println("밑변 6, 놃이 3인 삼각형 넓이 : " + cal(6.0, 3.0));
    }
}
