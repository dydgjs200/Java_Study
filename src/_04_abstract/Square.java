package _04_abstract;

public class Square extends Shape {

    // 구체적인 클래스
    public Square(String color){
        super(color);
    }

    //추상 메소드 구현
    void draw(){
        System.out.println("사각형 그리기");
    }
}
