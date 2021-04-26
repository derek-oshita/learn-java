import java.text.NumberFormat;
import java.util.*;

// https://www.youtube.com/watch?v=eIrMbAQSU34&ab_channel=ProgrammingwithMosh
// START PROJECT SECTION 

public class Main {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Principal Amount: ");
        int principal = Integer.parseInt(scanner.nextLine());

        System.out.println("Annual Interest Rate: ");
        float annualInterestRate = (Float.parseFloat(scanner.nextLine()) / 100) / 12; 

        System.out.println("Period (years): ");
        int period = Integer.parseInt(scanner.nextLine()) * 12; 

        double topHalf = Math.pow((1 + annualInterestRate), period) * annualInterestRate; 
        double bottomHalf = Math.pow(1 + annualInterestRate, period) - 1; 

        final double MORTGAGETOTAL = principal * (topHalf / bottomHalf); 

        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(); 
        System.out.println("Mortgage: " + currencyFormatter.format(MORTGAGETOTAL)); 

    }


}



