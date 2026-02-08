package Functions;

import java.util.*;

public class average {
    public static int Avg(int a, int b, int c) {
        int result = (a + b + c) / 3;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Enter third number: ");
        int c = sc.nextInt();

        int r = Avg(a, b, c);
        System.out.println("Average of three numbers is : " + r);
        sc.close();
    }
}
