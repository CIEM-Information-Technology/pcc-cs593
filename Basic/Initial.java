
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to print the initials of a string.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.util.Scanner;

class Initial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        sc.close();

        String result = Abbr.abbreviate(str);
        System.out.println("Initials: " + result);
    }
}

class Abbr {
    public static String abbreviate(String str) {
        String[] strarr = str.split(" ");
        String result = new String();

        for (String elem : strarr) {
            result += elem.charAt(0);
        }
        return result;
    }
}
