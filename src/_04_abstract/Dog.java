package _04_abstract;

public class Dog extends Animal{
    public Dog(String kind){
        super(kind);
    }

    @Override
    public void printAnimal() {
        System.out.println("멍멍");
    }
}
