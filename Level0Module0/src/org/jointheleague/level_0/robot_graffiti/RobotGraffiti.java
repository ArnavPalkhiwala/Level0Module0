package org.jointheleague.level_0.robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {

		Robot Bob = new Robot("vic");
		Bob.penDown();
		Bob.setSpeed(10);
		Bob.turn(45);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.move(-100);
		Bob.turn(135);
		Bob.move(140);
		Bob.hide();
		Bob.show();
		Bob.penUp();
		Bob.moveTo(200, 150);
		Bob.penDown();
		Bob.turn(135);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(45);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(280);
		Bob.turn(90);
		Bob.move(200);
		Bob.hide();
		Bob.show();
		Bob.penUp();
		Bob.moveTo(800, 200);
		Bob.penDown();
		for (int i = 0; i < 4; i++) {
			Bob.move(200);
			Bob.turn(90);
		}
		Bob.moveTo(900, 250);
		Bob.penUp();
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.penDown();
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
	}
}