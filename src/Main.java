import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        double a = 0.3;
        double b = 0.1;
        System.out.println(a - b);

        BigDecimal ab = new BigDecimal("0.3");
        BigDecimal ac = new BigDecimal("0.1");
        BigDecimal result = ab.subtract(ac);
        System.out.println(result);

    }
}