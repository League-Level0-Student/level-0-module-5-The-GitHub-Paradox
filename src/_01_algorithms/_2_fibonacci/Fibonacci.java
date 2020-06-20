package _01_algorithms._2_fibonacci;

import javax.swing.JOptionPane;

public class Fibonacci {
	public static void main(String[] args) {
String response = JOptionPane.showInputDialog("Would you like to see the first 10 numbers of the Fibonacci Sequence? (yes or no)");
if(response.contentEquals("yes")) {
System.out.println("1, 1, 2, 3, 5, 8, 13, 21, 34, 55");
}
else {
	System.out.println("Okay, I guess you don't like nerd stuff");
}
	}
}
