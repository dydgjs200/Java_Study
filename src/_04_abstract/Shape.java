package _04_abstract;

// 추상 클래스

public abstract class Shape {
    // 필드 선언
    private String color;


    public Shape(String color){
        this.color = color;
    }

    //추상 메소드 선언
    //선언만 하고 구현은 하지 않음
    // 구현 내용이 자식 클래스마다 다른 경우 추상메소드 사용
    abstract void draw();

    void start(){
        System.out.println("도형 그리기");
    }
    public String getColor(){
        return color;
    }
}
