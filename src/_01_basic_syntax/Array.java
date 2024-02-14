package _01_basic_syntax;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
//        int[] arr = new int[5];
        int sum = 0;
        Scanner sc = new Scanner(System.in);
//
//        for(int i=0; i<5; i++){
//            sum += sc.nextInt();
//        }
//        System.out.println((double)sum / 5);
//        System.out.println(arr);
//        System.out.println(Arrays.toString(arr));

//        for(int i=0; i<arr.length; i++){
//            arr[i] = sc.nextInt();
//        }

//        int[][] mat = new int[3][2];
//
//        for(int i=0; i<3; i++){
//            for(int j=0; j<2; j++){
//                mat[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0; i<mat.length; i++){
//            for(int j=0; j<mat[i].length; j++){
//                System.out.print(mat[i][j] + " ");
//            }
//            System.out.println();
//        }

        // sort
        int[] unsort = {1,4,52,6,789};
        Arrays.sort(unsort);
        System.out.println(Arrays.toString(unsort));

        // equals
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        System.out.println(Arrays.equals(a, b));
    }
}
