package Week6;

import java.util.Scanner;

public class FibonacciLab {
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int MAX_NUMBERS = 5;
    private static final int STOP_INPUT_VALUE = 0;

    public static void main(String[] args) {

        System.out.println("WEEK 6 - LAB 5");

        int[] myArray = new int[MAX_NUMBERS];

        int count = getCandidates(myArray);

        int index;

        for (index = 0; index < count; index++) {

            int currentValue = myArray[index];

            if (isFibonacci(currentValue) && isPrime(currentValue)) {
                System.out.println(currentValue + " is Fibonacci and is prime");
            } else if (isFibonacci(currentValue) && !isPrime(currentValue)) {
                System.out.println(currentValue + " is Fibonacci and is not prime");
            } else if (!isFibonacci(currentValue) && isPrime(currentValue)) {
                System.out.println(currentValue + " is not Fibonacci and is prime");
            } else {
                System.out.println(currentValue + " is not Fibonacci and is not prime");
            }

        } // end of for loop


    } // end of the main method

    private static boolean isPrime(int aNumber) {

        int divisor = 2;
        int index;
        for (index = 2; index < Math.sqrt(aNumber); index++) {
            if (aNumber % divisor == 0) {
                return false;
            }
            divisor++;
        } // end of the for loop

        return true;

    } // end of the isPrime method

    private static boolean isFibonacci(int aNumber) {

        int index;
        int current = 0;
        int previous = 1;
        int next;

        while (current < aNumber) {

            next = current + previous;
            previous = current;
            current = next;
        }
        if (current == aNumber) {
            return true;
        } else {
            return false;
        }
    } // end of the isFibonacci method

    private static int getCandidates(int[] candidates) {
        int index = 0;
        int inputValue;
        System.out.print("Please enter a number (0 to stop): ");
        do {
            inputValue = keyboard.nextInt();
           if (inputValue > 0) {
                candidates[index] = inputValue;
                index++;
            }
        } while (inputValue != STOP_INPUT_VALUE && index < MAX_NUMBERS);

    return index;

    } // end of the getCandidates method

} // end of the class


