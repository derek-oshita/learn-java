import java.text.NumberFormat;
import java.util.*;

import jdk.jfr.Percentage;

// https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
// START PROJECT SECTION 

public class Main {

    public static void main (final String[] args) {
        Scanner scanner = new Scanner(System.in); 
        final byte MONTHS = 12; 
        final byte PERCENT = 100; 

        // principal amount ($1k - $1M)
        System.out.println("Principal ($1k - $1M): ");
        int principal = scanner.nextInt(); 

        while (principal < 1_000 || principal > 1_000_000) {
            System.out.println("Principal ($1k - $1M): ");
            principal = scanner.nextInt(); 
        }

        // annual interest rate 3.92 = .0392
        System.out.println("Annual interest rate: ");
        float annualInterestRate = scanner.nextFloat(); 

        while (annualInterestRate > 100 || annualInterestRate < 0) {
            System.out.println("Annual interest rate: ");
            annualInterestRate = scanner.nextFloat(); 
        }

        // monthly interest rate
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS; 

        // years 
        System.out.println("Period (years): ");
        byte years = scanner.nextByte(); 

        while (years > 100 || years < 1) {
            System.out.println("Period (years): ");
            years = scanner.nextByte(); 
        }

        // number of payments 
        int numberOfPayments = years * MONTHS; 

        // final mortgage 
        double mortgage = principal
                    * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments))
                    / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1); 

        // formatted version of mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); 

        System.out.println("Your mortgage: " + mortgageFormatted);
    }


    // public class Mortgage {
    //     Scanner scanner = new Scanner(System.in); 

    //     final byte MONTHS_IN_A_YEAR = 12; 
    //     final byte PERCENTAGE = 100; 

    //     System.out.println("Principal Amount:");
    //     int principal = scanner.nextInt(); 

    //     System.out.println("Annual Interest Rate:");
    //     float annualInterestRate = scanner.nextFloat(); 
    //     float monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_A_YEAR; 

    //     System.out.println("Period (years):");
    //     byte years = scanner.nextByte(); 
    //     int numberOfPayments = years * MONTHS_IN_A_YEAR; 

    //     double mortgage = principal
    //                 * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) 
    //                 / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1); 

    //     String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); 

    //     System.out.println("Mortgage: " + mortgageFormatted);
    // }


}



