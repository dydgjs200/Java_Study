package _02_static;

public class FianlExCircle {
    final int radius;
    static final double PI = 3.141592653589793;


    public FianlExCircle(int radius){
        this.radius = radius;
    }

    public double cal(int radius){
        return PI*radius*radius;
    }
}
