/*
	Cory Daniel
	CSC 221
	May 8, 2015
*/

import java.util.*;

public class Palindrome {
	
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
		
        System.out.println("Please enter a word: ");
        String str = scan.nextLine();
		
		// Check str to isPalindrome
        if(isPalindrome(str))
            System.out.println("\"" + str + "\" is a palindrome.");
        else
            System.out.println("\"" + str + "\" is not a palindrome.");
    }
	
    public static boolean isPalindrome(String s) {
		// Base cases of 0 or 1 length, return true
        if(s.length() == 0 || s.length() == 1)
			return true; 
		
		// Check if first and last letters are the same ignoring case
		// If they are, recursion occurs, erasing the first and last letters off
        else if(s.substring(0,1).equalsIgnoreCase(s.substring(s.length()-1)))
            return isPalindrome(s.substring(1, s.length()-1));
		
		// If the two letters aren't equal and the length isn't 1 or 0, return false
		else
			return false;
    }
}