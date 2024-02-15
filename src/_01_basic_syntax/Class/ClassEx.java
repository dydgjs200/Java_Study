package _01_basic_syntax.Class;

public class ClassEx {
    public int number;
    public String name;

    //생성자 -> 클래스 명과 동일
    public ClassEx(int number, String name){
        this.number = number;
        this.name = name;
    }

    // 메소드
    public void test(){
        System.out.println("test");
    }

    public static void main(String[] args) {
        // 객체 생성
        ClassEx ex = new ClassEx(10, "choi");
        ex.test();
    }
}
