
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to sort an array.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.Scanner;

class Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        Sort.selectionSort(arr);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}

class Sort {
    public static void selectionSort(int array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                if (array[i] < array[min_idx]) {
                    min_idx = i;
                }
            }
            int temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}
