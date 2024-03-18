package Week5;

import java.util.Scanner;

public class TaxTimeWithKingGeoff {

    public static final double STINKING_RICH = 500000;

    private static final double QUITE_RICH = 200000;

    private static final double MIAMI_POOR = 100000;

    private static final double AVERAGE = 50000;

    private static final double REALISTIC = 20000;
    private static final double POOR = 20000;

    private static final double HIGH_RATE = 0.25;

    private static final double MEDIUM_RATE = 0.1;

    private static final double LOW_RATE = 0.03;
    private static final double POOR_TAX = 0.0;

    // Constant Declaration
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Week 5 - LAB 4");

        double income = 0.0;
        double deduction = 0.0;
        double amount;


        //Input Double Variables

        do {
            System.out.println("Enter next amount: ");
            amount = keyboard.nextDouble();

            if (amount > 0) {
                income += amount;
            } else {
                deduction += Math.abs(amount);
            } //end of if else
        } while (amount != 0); // end of do while

        double taxableIncome = computeTaxableIncome(income, deduction);
        char taxGroup = computeTaxGroup(taxableIncome);
        double tax = computeTax(taxGroup, taxableIncome);
        displayTaxInformation(income, deduction, taxableIncome, taxGroup, tax);
    } //End of the Main method

    private static double computeTaxableIncome(double income, double deduction) {
        if (income >= deduction) {
            return (income - deduction);
        }//end of if
        else {
            return 0.0;
        }//end of else
    }//end of computeTaxableIncome method

    private static char computeTaxGroup(double taxable) {
        if (taxable >= STINKING_RICH) {
            return 'S';
        } else if (taxable >= QUITE_RICH) {
            return 'Q';
        } else if (taxable >= MIAMI_POOR) {
            return 'M';
        } else if (taxable >= AVERAGE) {
            return 'A';
        } else if (taxable >= REALISTIC) {
            return 'R';
        } else {
            return 'P';
        } //end of if-else Tax Group
    } //end of computeTaxGroup method

    private static double computeTax(char taxGroup, double taxable) {
        if (taxGroup == 'S' || taxGroup == 'Q') {
            return HIGH_RATE * taxable;
        } else if (taxGroup == 'M') {
            return MEDIUM_RATE * taxable;
        } else if (taxGroup == 'A' || taxGroup == 'R') {
            return LOW_RATE * taxable;
        } else if (taxGroup == 'P') {
            return POOR_TAX;
        } else {
            System.out.println("Error!");
            return 0.0;
        }
    } //end of computeTax

    private static void displayTaxInformation(double income, double deduction, double taxable, char taxGroup, double tax) {
        System.out.println("Income: $" + income);
        System.out.println("Deductions: $" + deduction);
        System.out.println("Taxable Income: $" + taxable);
        System.out.println("Tax Group: " + taxGroup);
        System.out.println("Tax owed: $" + tax);

    }//end of displayTaxInformation
} // End of the TaxTime class