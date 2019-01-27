/**************************************************
Name            Dustin Sumarli
Class           CS& 141B
Term            Winter 2019
Assignment 3    Checking Social Security Number
Description     This program accepts a number and checks if it is a valid SSN
**************************************************/
// Checks if an SSN is vaild
import java.util.Scanner;
public class CheckSSN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt for user input
        System.out.print("Enter a Social Security Number in the format "
                + "111-11-1111: ");
        String number = input.nextLine();    
        
        // Check if dashes are at correct locations and length is correct
        if (number.length() == 11
            && number.charAt(3) == '-' && number.charAt(6) == '-' ){
            // Divide string into 3 substrings to ignore dashes
            String a = number.substring(0,3);
            String b = number.substring(4,6);
            String c = number.substring(7,11);
            // Check if all substrings are numeric by comparing ASCII values
            if ((a.compareTo("000") >= 0 && a.compareTo("999") <= 0)
                && (b.compareTo("00") >= 0 && b.compareTo("99") <= 0)
                && (c.compareTo("0000") >= 0 && c.compareTo("9999") <= 0)){
                System.out.println(number + 
                        " is a valid social security number.");
            }else {
                System.out.println(number + 
                        " is an invalid social security number.");
            }
        }else {
                System.out.println(number + 
                        " is an invalid social security number.");
        }
    } // end main
} // end class
