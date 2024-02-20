package _03_inherit;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat = new Cat("고양이", "야옹이", 10);
        Dog dog = new Dog("강아지", "멍멍이", 12);

        System.out.println(cat.makeSound());
        System.out.println(dog.makeSound());
    }
}
