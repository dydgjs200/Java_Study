package _04_abstract;

public class ShapeEx {
    // shape 객체는 new 연산자로 직접 생성할 수 없지만(new Shape 로 못함)
    // 자식 클래스인 circle, square 에서는 new 연산자로 객체 생성 가능
    
    // 즉 추상클래스는 선언부만 존재하고 자식 클래스에서 내용 채우기가 필요

    public static void main(String[] args) {
        Circle circle = new Circle("blue"); // 자식 클래스
        Square square = new Square("red");

        circle.start();
        circle.draw();
        System.out.println("원 색상은 : " + circle.getColor());

        square.start();
        square.draw();
        System.out.println("사각형 색상은 : " + square.getColor());

    }
}
