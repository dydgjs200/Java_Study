package _02_static;

public class Rect {
    private int width;
    private int height;

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int cal(int width, int height){
        return width * height;
    }

}
