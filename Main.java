import java.text.NumberFormat;
import java.util.*;

// https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
// START PROJECT SECTION 

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 

        final byte MONTHS_IN_A_YEAR = 12; 
        final byte PERCENTAGE = 100; 

        System.out.println("Principal Amount:");
        int principal = scanner.nextInt(); 

        System.out.println("Annual Interest Rate:");
        float annualInterestRate = scanner.nextFloat(); 
        float monthlyInterestRate = annualInterestRate / PERCENTAGE / MONTHS_IN_A_YEAR; 

        System.out.println("Period (years):");
        byte years = scanner.nextByte(); 
        int numberOfPayments = years * MONTHS_IN_A_YEAR; 

        double mortgage = principal
                    * (monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)) 
                    / (Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1); 

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage); 

        System.out.println("Mortgage: " + mortgageFormatted);
    }


}



