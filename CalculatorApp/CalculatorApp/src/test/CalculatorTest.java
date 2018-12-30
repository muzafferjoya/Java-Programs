package test;

import java.util.Scanner;
import static operations.Calculator.add;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("Provides the first value:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Provides the second value:");
        int b = scan.nextInt();
        int result = add(a, b);
        System.out.println("The result of the sum is:" + result);
    }
}
