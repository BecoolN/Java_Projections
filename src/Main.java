import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("input your age, please!");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println(input);

        if(input <=15 ) {
            System.out.println("you are a child!");
        } else {
            System.out.println("you are not child!");
        }
    }
}