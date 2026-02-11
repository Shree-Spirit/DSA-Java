package Arrays;

import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {

        System.out.println("Enter the size of array : ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        System.out.println("Enter the numbers : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }

        }
        System.out.println("Array elements are : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + "");
            }
            System.out.println();
        }
        sc.close();

    }

}
