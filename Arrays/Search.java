package Arrays;

import java.util.*;

public class Search {
    public static void main(String[] a) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterht the size of the array");
        int size = sc.nextInt();

        int[] n = new int[size];
        for (int i = 0; i < size; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }
        System.out.println("Enter the number to be searched");
        int x = sc.nextInt();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == x)
                System.out.println("Element x is found at " + i);

        }

        sc.close();
    }

}
