package Functions;

import java.util.*;

public class Multiply {

    public static int MultiplyTwoNumbers(int a, int b) {
        int mul = a * b;
        System.out.print("Result :");

        return mul;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second number :");
        int b = sc.nextInt();
        int result = MultiplyTwoNumbers(a, b);
        System.out.println(result);
        sc.close();
    }
}
