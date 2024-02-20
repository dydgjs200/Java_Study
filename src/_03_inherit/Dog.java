package _03_inherit;

public class Dog extends Animal{
        public Dog(String kind, String name, int age){
            super(kind, name, age);
        }

        @Override
        public String makeSound(){
            return "강아지는 소리를 낸다.";
        }
}
