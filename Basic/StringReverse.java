
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to print a string in reversed order.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.Scanner;

class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();
        String rstr = StringReverseSol.reverse(str);

        System.out.println("Reversed String: " + rstr);
    }
}

class StringReverseSol {
    public static String reverse(String str) {
        String rstr = new String();

        for (int index = str.length(); index > 0; index--) {
            rstr += str.charAt(index - 1);
        }
        return rstr;
    }
}
