package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String word1= JOptionPane.showInputDialog("Enter an adjective");
		// Get the user to enter a type of liquid
String word2= JOptionPane.showInputDialog("Enter a type of liquid");
		// Get the user to enter a body part
String word3= JOptionPane.showInputDialog("Enter a body part");
		// Get the user to enter a verb
String word4= JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
String word5= JOptionPane.showInputDialog("Enter a place");
		// Fit the user's words into this sentence, and save it in a String:
	
		JOptionPane.showMessageDialog(null, "Piranhas are more " + word1 + "during the day, so cross the river at \n" 
		 + "night. Piranhas are attracted to fresh " + word2 + " and will most \n"
		 + "likely take a bite out of your " + word3 + " if you " + word4 + " Whatever \n"
		 + "you do, if you have an open wound, try to find another way to get \n"
		 + "back to the " + word5 + " Good luck! \n");
		// Make a pop-up for the final story. You can use \n to go to the next line.
		

	}
}

