package org.jointheleague.level_0.greeter;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String greeter = JOptionPane.showInputDialog(null, "What is your name?");
		String hi = "Hi " + greeter;
		JOptionPane.showMessageDialog(null, hi);

	}

}
