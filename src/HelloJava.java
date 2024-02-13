import _01_basic_syntax.Casting;
import java.util.Scanner;

import java.math.BigDecimal;
public class HelloJava {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] in = scan.nextLine().split(" ");

        BigDecimal a = new BigDecimal(in[0]);
        BigDecimal b = new BigDecimal(in[1]);

        Casting cast = new Casting(a,b);
        cast.setA(new BigDecimal(1112));
        cast.setB(new BigDecimal(4154616316.3334));
        System.out.println(cast.add());
        System.out.println(cast.sub());
    }
}
