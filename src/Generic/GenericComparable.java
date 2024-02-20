package Generic;

public class GenericComparable<T> {

    // <T extends Comparable<T>> T 는 Comparable 함수의 타입을 T로 하한 제한
    // 즉, T extends T는 모든 타입을 갖게 된다.
    public static <T extends Comparable<T>> T max(T a, T b){
        if(a.compareTo(b) > 0){
            return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(max(10, 20));
    }
}
