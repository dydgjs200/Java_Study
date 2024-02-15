package _01_basic_syntax;

import java.util.*;

public class ExceptionEX {
    // 예외
    // - 일반 예외 (exception) : 컴파일러가 예외 처리 코드 여부를 검사
    // - 실행 예외 (Runtime Exception) : 컴파일러가 예외 처리를 검사하지 않음.
    
    // 예외 발생 시, java는 예외클래스에서 객체를 생성 후 처리에 사용
    // try-catch-finally

//    public static String divide(int x, int y){
//        return x + "/" + y + " = " + (x/y);
//    }
    public static void main(String[] args) {

//        try{
//            System.out.println(divide(6, 0));
//        }catch(Exception e) {
//            System.out.println("오류 발생  =  " + e.getMessage());
//        }finally {
//            System.out.println("예외처리 끝!");
//        }

        //ass #1
//        int arr1[] = new int[4];
//        for(int i=0; i<5; i++){
//            try{
//                arr1[i] = i+1;
//                System.out.println(arr1[i]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("인덱스 범위 벗어남 : " + e.getMessage());
//            }
//        }

        //ass #2
        Scanner sc = new Scanner(System.in);
        System.out.println("배열 크기 입력");
        int input = sc.nextInt();
        int[] arr = new int[input];

        try{
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                System.out.println("배열 입력");
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            double avg = sum / arr.length;
            System.out.println("평균 : " + avg);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("배열 범위 초과");
        }catch(InputMismatchException e){
            System.out.println("배열 타입 오류");
        }catch (ArithmeticException e){
            System.out.println("계산 오류");
        }catch (Exception e){
            System.out.println("나머지 예외 처리");
        }

        // ass #3

//        try{
//            Scanner sc = new Scanner(System.in);
//            System.out.println("배열 입력");
//            String[] num = sc.nextLine().split(" ");
//            ArrayList<String> list = new ArrayList<>();
//            ArrayList<String> res = new ArrayList<>();
//
//            for(int i=0; i<num.length; i++){
//                if (!list.contains(num[i])){
//                    list.add(num[i]);
//                }else{
//                    res.add(num[i]);
//                }
//            }
//
//            System.out.println(res);
//
//        }catch (Exception e){
//            System.out.println(e);
//        }



    }
}
