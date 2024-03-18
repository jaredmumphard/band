package Week7;

import java.util.Scanner;

public class IThinkThereforeIAm {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String inputString;
        String qualities = "";
        qualities = "The qualities are ";
        System.out.println("Please enter sentences, . to end.");
        inputString = keyboard.nextLine();

        while (!inputString.equals(".")) {
            if(inputString.startsWith("I am")) {
                qualities = qualities + inputString.substring(5) + ", ";
                inputString = keyboard.nextLine();
            }//end of if statement
            else {
                inputString = keyboard.nextLine();
            }//end of else statement
        }//end of while loop
        System.out.println(qualities);
    }//end of main method
    
}//end of IAm class
