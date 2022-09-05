
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to find maximum and minimum among three numbers.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.Scanner;

class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        sc.close();

        int minimum = MinMaxFinder.min(MinMaxFinder.min(x, y), z);
        int maximum = MinMaxFinder.max(MinMaxFinder.max(x, y), z);
        System.out.println("Min: " + minimum + ", max: " + maximum);

    }
}

class MinMaxFinder {
    public static int min(int n1, int n2) {
        if (n1 < n2)
            return n1;
        else
            return n2;
    }

    public static int max(int n1, int n2) {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
}
