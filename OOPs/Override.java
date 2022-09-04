
/**
 * @file Initial.java
 * @author Kaji Nasiruddin Ahmed
 * @brief wap to implement overiding fetaures.
 * @version 0.1
 * @date 2022-09-04
 * 
 * @copyright Copyright (c) 2022
 * 
 */
public class Override {
    public static void main(String[] args) {
        Bank bank = new Bank();
        SBI sbi = new SBI();

        System.out.println("Interest Rate of any Bank: " + bank.getInterestRate());
        System.out.println("Interest Rate of SBI Bank: " + sbi.getInterestRate());
    }
}

class Bank {
    protected double ir;

    Bank() {
        this.ir = 7;
    }

    public double getInterestRate() {
        return this.ir;
    }
}

class SBI extends Bank {
    SBI() {
        this.ir = 7.05;
    }

    public double getInterestRate() {
        return this.ir;
    }
}
