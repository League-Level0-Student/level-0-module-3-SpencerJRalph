
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "April 11th";
		String dadsBirthday = "September 28th";
		String myBirthday = "October 7th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String hi = JOptionPane.showInputDialog("Whos birthday do you want, mine, my dads, or my moms?");
		// 3. Print out what the user typed
		System.out.println(hi);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(hi.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(hi.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(hi.equalsIgnoreCase("Spencer")) {
			JOptionPane.showMessageDialog(null, myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else { 
			JOptionPane.showMessageDialog(null, "Sorry, i dont remember that persons birthday");
		}
	} 
}
