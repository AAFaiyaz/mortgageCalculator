package com.faiyaz;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Update
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate  = scanner.nextFloat();
        float montlyInterestRate = annualInterestRate/MONTHS_IN_YEAR/PERCENT;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
        float numberOfPayements = period*MONTHS_IN_YEAR;

        double mortgage = principle
                    *((montlyInterestRate*Math.pow((1+montlyInterestRate),numberOfPayements))
                    /(Math.pow((1+montlyInterestRate),numberOfPayements)-1));

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String mortgage = currency.format((principle*((montlyInterestRate*Math.pow((1+montlyInterestRate),numberOfPayements))/(Math.pow((1+montlyInterestRate),numberOfPayements)-1))));
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.println("Mortgage: "+mortgageFormatted);

    }
}
