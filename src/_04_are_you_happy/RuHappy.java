package _04_are_you_happy;

import javax.swing.JOptionPane;

public class RuHappy {
public static void main(String[] args) {
	
	String hi = JOptionPane.showInputDialog("Are you Happy?");{
	if(hi.equalsIgnoreCase("no")) {
		String my = JOptionPane.showInputDialog("Do you want to be happy?");
		if(my.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		}
		else if(my.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Change Something");
		}
	}
	else if(hi.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
