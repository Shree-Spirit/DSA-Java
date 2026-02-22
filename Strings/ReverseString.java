package Strings;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String input = sc.nextLine();
        StringBuilder a = new StringBuilder(input);

        System.out.println("Entered string is : " + a);
        int i;

        // Logic for reversing a string
        for (i = 0; i < a.length() / 2; i++) {
            int front = i;
            int last = a.length() - i - 1;

            char FirstChar = a.charAt(front);
            char LastChar = a.charAt(last);

            a.setCharAt(front, LastChar);
            a.setCharAt(last, FirstChar);

        }
        System.out.println("Reversed String is : " + a);

        sc.close();

    }

}
