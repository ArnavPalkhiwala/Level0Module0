package org.jointheleague.level_0.knock_knock_joke;

import javax.swing.JOptionPane;

public class KnockKnockJoke {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Knock, Knock,");
		JOptionPane.showMessageDialog(null, "Who's there");
		String v = JOptionPane.showInputDialog("Do you like this joke?");
		System.out.println(v);

	}

}
