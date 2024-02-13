import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Scanner a = new Scanner(System.in);
//        System.out.println("이름을 입력하세요");
//        String name = a.nextLine();
//        System.out.println("나이를 입력하세요");
//        int age = a.nextInt();
//
//        System.out.println("안녕하세요! "+name+"님 ("+age + ")세");

//        int[] arr = new int[5];
//        String[] sp = a.nextLine().split(" ");
//
//        for(int i=0; i<sp.length; i++){
//            arr[i] = Integer.parseInt(sp[i]);
//            System.out.println("arr > " + arr[i]);
//        }


        // type casting
        int small = 10;
        double big = small;
        System.out.println(big);
        System.out.println((int)big);

        String a = "aa";
        String b = a;
        String c = new String("aa");
        String d = "aa";
        String e = "aa";

//        System.out.println(a.equals(b));
//        System.out.println(a.equals(c));
//        System.out.println(b.equals(a));
//        System.out.println(a == b);
//        System.out.println(a == c);

        System.out.println(a==d);
        System.out.println(a==e);

        int num = 10;
        String s = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println(s);

        System.out.println("나이 입력");
        int age = new Scanner(System.in).nextInt();

        if(age >= 1 && age <= 7){
            System.out.println("유아");
        }else if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        }else if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        else if (age >= 17 && age <= 19) {
            System.out.println("고학생");
        }else{
            System.out.println("성인");
        }

        System.out.println("이름 입력");
        String name = new Scanner(System.in).nextLine();
        if(name.equals("홍길동")){
            System.out.println("남자");
        }else if(name.equals("성춘향")){
            System.out.println("여자");
        }
        else{
            System.out.println("모르겠음");
        }
    }
}