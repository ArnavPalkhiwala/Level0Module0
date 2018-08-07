
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import org.jointheleague.graphical.robot.Robot;

public class Robots {

	Robot r;
	ArrayList<Integer> shapes;
	public String robotImg;

	public Robots(String robotImg, ArrayList<Integer>shapes) {

		this.robotImg = robotImg;
		this.shapes = shapes;
		r = new Robot();
		r.changeRobot(robotImg);
		setRobotImg(robotImg);
		
	}

	void getRobotImg() {

	}

	void setRobotImg(String robotImg) {
		
		r.changeRobot(robotImg);

	}
	
	void draw() {
		
		for (Integer integer : shapes) {
			
			
			for (int i = 0; i < integer; i++) {
				
				r.setPenColor(Color.black);
				r.penDown();
				r.setSpeed(10);
				int x = 25;
				r.move(x);
				
				
				r.move(100);
				r.turn(360/integer);;
				
			}
			
			
		}
		
	}
	
	public static void main(String [] args) { 
		
		ArrayList<Integer> shapes = new ArrayList<Integer>();
		 Robots rr = new Robots("https://png.pngtree.com/element_pic/00/16/07/11578277afd02ba.jpg", shapes);
		 shapes.add(4);
		 shapes.add(3);
		rr.draw();
		
		
		
	}

}
