
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to print the first 10 prime numbers.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
class Prime {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;
        while (count < 10) {
            if (PrimeChecker.isPrime(num)) {
                count++;
                System.out.print(num + ", ");
            }
            num++;
        }
    }
}

class PrimeChecker {
    public static boolean isPrime(int num) {
        for (int i = 2; i < Math.ceil(Math.sqrt(num)); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
