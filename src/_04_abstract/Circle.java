package _04_abstract;

public class Circle extends Shape {

    // 구체적인 클래스
    public Circle(String color){
        super(color);
    }

    //추상 메소드 구현
    void draw(){
        System.out.println("원 그리기");
    }
}
