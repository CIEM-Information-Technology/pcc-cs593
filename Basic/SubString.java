
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to print a substring.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.Scanner;

class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter starting and ending index: ");
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        String substr = SubStringFinder.find(str, start, end);

        System.out.println("SubString: " + substr);
    }
}

class SubStringFinder {
    public static String find(String str, int start, int end) {
        String substr = new String();

        for (int index = start; index < end; index++) {
            substr += str.charAt(index);
        }
        return substr;
    }
}
