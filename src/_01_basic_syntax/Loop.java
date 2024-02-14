package _01_basic_syntax;

public class Loop {
    public static void main(String[] args){
        for(int i=0, j = -10; i<10; i++, j--){
            System.out.println("ddd");
            System.out.println(j);
        }

        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while (j < 10);

        System.out.println("=====================");

        String[] arr = {"A","B","C"};
        for(String s:arr){
            System.out.println(s);
        }
    }
}
