package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String userName= JOptionPane.showInputDialog("Please enter your name(answers will not be saved)");
		// 2. Print upper case name to the console using .toUpperCase()
		System.out.println(userName.toUpperCase());
		//    Run your program to see that this works.
//works
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
System.out.println(userName.length());
			// 4. Create a String variable to store the next character of the name
int nextName = (userName.length());
			//    using .substring(start, end)
userName.substring(beginIndex, endIndex);
			//    HINT: replace 'start' and 'end' to get String with character at i 
			
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.

			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		
		// 7. Use pop-up to show user their Goofy name

	}
}

