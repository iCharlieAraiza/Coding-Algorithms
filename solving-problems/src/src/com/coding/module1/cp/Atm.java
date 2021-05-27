package com.coding.module1.cp;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * ATM
 * Problem code: HS08TEST
 *
 */


public class Atm {

    public double withdraw(int amount, double balance){
        //long test = System.in.read();
        //int test2 = Integer.parseInt(in.nextLine());
        if( amount%5!=0 || amount>balance )
            return balance;
        return balance - amount - 0.50;
    }
}
