package _16_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[] args) {
	Robot rob = new Robot();
	rob.penDown();
	for (int i = 0; i < 4; i++) {
	rob.turn(90);
	rob.move(50);
}
	drawSquare();
}

private static void drawSquare() {
	// TODO Auto-generated method stub
	Robot rob = new Robot();
	rob.penDown();
	for (int i = 0; i < 4; i++) {
	rob.turn(90);
	rob.move(50);
}
}
}