
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to arrage a list of string in lexicographical order using buffer reader.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
import java.io.BufferedReader;
import java.io.FileReader;

class LexicoGraphy {
    public static void main(String[] args) {
        char[] arr = new char[150];
        try {
            FileReader file = new FileReader("dict.txt");
            BufferedReader input = new BufferedReader(file);
            input.read(arr);
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
        String nstr = new String(arr);
        String[] strarr = nstr.split("\n");

        System.out.println("Before: ");

        for (String e : strarr) {
            System.out.println("\t" + e);
        }

        Lex.lexSort(strarr);

        System.out.println("\n\nAfter: ");
        for (String e : strarr) {
            System.out.println("\t" + e);
        }

    }
}

class Lex {
    public static void lexSort(String array[]) {
        int size = array.length;

        for (int step = 0; step < size - 1; step++) {
            int min_idx = step;

            for (int i = step + 1; i < size; i++) {

                if (array[i].compareTo(array[min_idx]) < 0) {
                    min_idx = i;
                }
            }
            String temp = array[step];
            array[step] = array[min_idx];
            array[min_idx] = temp;
        }
    }
}