package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) { // current<arr[j] ===> 3<8
                arr[j + 1] = arr[j]; // 7 8 8 ====> 8 is moved in right place
                j--; // j=0(for first iteration)
                // 1(3) and 0(7) compared and 7 shifts to right
            }
            arr[j + 1] = current; // 0(3) ----> 3,7,8

        }
        Insertionsort(arr);
    }

    public static void Insertionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}