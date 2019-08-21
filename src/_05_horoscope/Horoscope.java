package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	String star = JOptionPane.showInputDialog("What is your star sign");
	if(star.equalsIgnoreCase("Taurus")) {
		JOptionPane.showMessageDialog(null, "You are pleasure seeking, love control, dependable,grounded,provoke slowly, and are highly sensual in nature");
	}
	else if(star.equalsIgnoreCase("Aries")) {
		JOptionPane.showMessageDialog(null, "You are courages, energetic, willful, commanding, leading. You often lead when following would be best course of action");
	}
	else if(star.equalsIgnoreCase("Gemini")) {
		JOptionPane.showMessageDialog(null, "You are cerebral, chatty, you love learning and education, you're charming, and adventurous");
	}
	else if(star.equalsIgnoreCase("Cancer")) {
		JOptionPane.showMessageDialog(null, "You are emotional, group oriented. You also seek security and family.");
	}
	else if(star.equalsIgnoreCase("leo")) {
		JOptionPane.showMessageDialog(null, "Youu are generous, organized, protective, and beautiful.");
	}
	else if(star.equalsIgnoreCase("Virgo")) {
		JOptionPane.showMessageDialog(null, "You are particular, logical, pratical, have a sence of duty, and are critical.");
	}
	else if(star.equalsIgnoreCase("Libra")) {
		JOptionPane.showMessageDialog(null, "You are balanced, seek beauty, and have a sense of justice");
	}
	else if(star.equalsIgnoreCase("Scorpio")) {
		JOptionPane.showMessageDialog(null, "You are passionate, exacting, combative, reflective, and you love extremes.");
	}
	else if(star.equalsIgnoreCase("Sagittarius")) {
		JOptionPane.showMessageDialog(null, "You are happy, absent minded, creative, and adventurous");
	}
	else if(star.equalsIgnoreCase("Capricorn")) {
		JOptionPane.showMessageDialog(null, "You are Timeless, driven, calculating, and ambitious");
	}
	else if(star.equalsIgnoreCase("Aquarius")) {
		JOptionPane.showMessageDialog(null, "You are forward thinking, communicative, people oriented, stubborn, generous, and dedicated");
	}
	else if(star.equalsIgnoreCase("Pisces")) {
		JOptionPane.showMessageDialog(null, "You are likeable, energetic, passionate, and sensitive");
	}
	else {
		JOptionPane.showMessageDialog(null, "Thats not a star sign");
	}
}
}
