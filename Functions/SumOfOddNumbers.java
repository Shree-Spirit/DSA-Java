package Functions;

import java.util.*;

public class SumOfOddNumbers {
    public static int Sum(int n) {
        int s = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                s = s + i;
            }
        }
        return s;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int r = Sum(n);
        System.out.println("Sum of odd numbers is : " + r);
        sc.close();

    }

}
