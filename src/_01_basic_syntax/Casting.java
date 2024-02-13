package _01_basic_syntax;
import java.math.BigDecimal;

public class Casting {
    BigDecimal a;
    BigDecimal b;
    public Casting(BigDecimal a, BigDecimal b) {
        this.a = a;
        this.b = b;
    }

    public void setA(BigDecimal a) {
        this.a = a;
    }

    public void setB(BigDecimal b) {
        this.b = b;
    }

    public BigDecimal getA() {
        return a;
    }

    public BigDecimal getB() {
        return b;
    }

    public BigDecimal add(){
        return a.add(b);
    }

    public BigDecimal sub(){
        return a.subtract(b);
    }
}
