package _03_inherit;

public class Cat extends Animal{
    public Cat(String kind, String name, int age){
        super(kind, name, age);
    }

    @Override
    public String makeSound(){
        return "야옹이는 소리를 낸다.";
    }
}
