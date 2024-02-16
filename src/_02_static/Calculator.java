package _02_static;


// static은 정적이므로 생성자 초기화를 하지 않음 (생성자 초기화는 동적이므로)
// static 메소드에서 매개변수 들이 인스턴스 필드를 이용하지 않기에 static으로 지정하는 것이 좋음
public class Calculator {
    static double pi = 3.141592;

    static int plus(int x, int y){
        return x+y;
    }

    static int minus(int x, int y){
        return x-y;
    }
}
