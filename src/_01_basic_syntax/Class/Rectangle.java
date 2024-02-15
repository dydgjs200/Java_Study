package _01_basic_syntax.Class;

import java.util.Scanner;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int cal(){
        return width*height;
    }


    public static void main(String[] args) {
        String[] num = new Scanner(System.in).nextLine().split(" ");
        Rectangle rect=  new Rectangle(Integer.parseInt(num[0]), Integer.parseInt(num[1]));
        System.out.println(rect.cal());
    }
}
