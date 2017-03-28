package org.jointheleague.level_0.everything_is_awsome;

import javax.swing.JOptionPane;

public class EverythingIsAwesome {
	public static void main(String[] args) {
		String Input = JOptionPane.showInputDialog(null, "What do you like?");
		JOptionPane.showConfirmDialog(null, Input + "  is awesome!");

	}
}
