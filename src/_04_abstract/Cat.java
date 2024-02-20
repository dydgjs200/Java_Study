package _04_abstract;

public class Cat extends Animal{
    public Cat(String kind){
        super(kind);
    }
    @Override
    public void printAnimal() {
        System.out.println("야옹~");
    }
}
