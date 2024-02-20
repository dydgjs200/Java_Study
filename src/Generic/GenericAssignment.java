public class GenericAssignment<T extends Number> {

    private T num1;
    private T num2;

    public GenericAssignment(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public static <T extends Number> double add(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double cal(){
        return add(num1, num2);
    }

    public static void main(String[] args) {
        GenericAssignment<Integer> assignment = new GenericAssignment<>(10, 20);
        System.out.println(assignment.cal());

        GenericAssignment<Double> assignment2 = new GenericAssignment<>(3.0156489749, 2.1568);
        System.out.println(assignment2.cal());
    }
}
