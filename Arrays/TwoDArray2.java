package Arrays;

import java.util.*;

public class TwoDArray2 {
    public static void main(String[] args) {
        int i, j, x;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        System.out.println("Enter the size of rows of array");
        int rows = sc.nextInt();
        System.out.println("Enter the size of columns of array");
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the array elements: ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.println("Array elements are : ");
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                System.out.println(numbers[i][j]);
            }
        }
        System.out.println("Enter the element for searching ");
        x = sc.nextInt();
        for (i = 0; i < rows; i++) {
            for (j = 0; j < columns; j++) {
                if (x == numbers[i][j]) {
                    System.out.println("Element is found at (" + i + "," + j + ")");
                }
            }
        }
        sc.close();

    }
}