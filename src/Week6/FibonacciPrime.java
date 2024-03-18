package Week6;

import java.util.Scanner;

public class FibonacciPrime {

    public static void main(String[] args) {

        int[] numbers = new int[10];
        int count = readNumbers(numbers);
        for (int i = 0; i < count; i++) {
            boolean isFibonacci = isFibonacci(numbers[i]);
            boolean isPrime = isPrime(numbers[i]);
            System.out.print(numbers[i] + " is ");
            if (!isFibonacci && !isPrime)
                System.out.println("not Fibonacci and is not prime");
            else if (isFibonacci && isPrime)
                System.out.println("Fibonacci and is prime");
            else if (isFibonacci)
                System.out.println("Fibonacci and is not prime");
            else
                System.out.println("not Fibonacci and is prime");
        } // for loop with if statements
    } // end of Main

    public static int readNumbers(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        do {
            System.out.print("Please enter a number (0 to stop): ");
            int num = scanner.nextInt();
            if (num == 0)
                break;
            numbers[count++] = num;
        } while (count < numbers.length);
        return count;
    } //do-while loop

    public static boolean isFibonacci(int num) {
        int a = 0, b = 1;
        while (b < num) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b == num;
    } //Setting Fibonacci parameters using boolean

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num <= 3)
            return true;
        if (num % 2 == 0 || num % 3 == 0)
            return false;
        int i = 5;
        while (i * i <= num) {
            if (num % i == 0 || num % (i + 2) == 0)
                return false;
            i += 6;
        }
        return true;
        } //Setting Prime parameters using boolean
}  // end of Fibonacci class

