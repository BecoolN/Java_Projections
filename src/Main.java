import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            int number = Integer.parseInt("12");
            System.out.println(number);

            for(int i = 10; i  >=0; i--){
                System.out.println(10 / i);
            }
        } catch (NumberFormatException e){
            System.out.println("failed parse X12 :");
            System.out.println(e);
        } catch (ArithmeticException a){
            System.out.println(a);
        }
    }
}