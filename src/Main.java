import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("이름");
        String name = a.nextLine();
        System.out.println("나이");
        int age = a.nextInt();

        System.out.println("이름 : "+name+", 나이 : "+age);

//        int[] arr = new int[5];
//        String[] sp = a.nextLine().split(" ");
//
//        for(int i=0; i<sp.length; i++){
//            arr[i] = Integer.parseInt(sp[i]);
//            System.out.println("arr > " + arr[i]);
//        }
    }
}