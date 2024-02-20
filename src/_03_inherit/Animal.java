package _03_inherit;

public class Animal {
    private String kind;
    private String name;
    private int age;

    public Animal(String kind, String name, int age){
        this.kind = kind;
        this.name = name;
        this.age = age;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String makeSound(){
        return "동물은 소리를 낸다";
    }
}
