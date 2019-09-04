package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	static Robot rob = new Robot();
public static void main(String[] args) {
 rob.penDown();
String shape = JOptionPane.showInputDialog("what shape do you want? (circle, square, or triangle");
String color = JOptionPane.showInputDialog("What color do you want your shape to be? (RED, ORANGE, YELLOW, BLUE)");
if(color.equalsIgnoreCase("red")) {
	rob.setPenColor(Color.red);
}
if(color.equalsIgnoreCase("orange")) {
	rob.setPenColor(Color.orange);
}
if(color.equalsIgnoreCase("Yellow")) {
	rob.setPenColor(Color.yellow);
}
if(color.equalsIgnoreCase("blue")) {
	rob.setPenColor(Color.blue);
}
if(shape.equalsIgnoreCase("circle")) {
	drawCircle();

}
if(shape.equalsIgnoreCase("triangle")) {
	drawTriangle();
}
if(shape.equalsIgnoreCase("square")) {
	drawSquare();
}
}



static void drawSquare() {
	for (int i = 0; i < 4; i++) {
		rob.turn(90);
		rob.move(100);
}
}
static void drawTriangle() {
	for (int in = 0; in < 3; in++) {
		rob.turn(120);
		rob.move(100);
	}
}
static void drawCircle() {
	for (int iss = 0; iss < 36; iss++) {
		rob.turn(10);
		rob.move(10);
	}
}
}
