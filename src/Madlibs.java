import javax.swing.JOptionPane;

public class Madlibs {
	public static void main(String[] args) {
		String noun = JOptionPane.showInputDialog("Tell me a noun...");
		String adjective = JOptionPane.showInputDialog("Tell me an adjective..");
		String verb = JOptionPane.showInputDialog("Tell me a verb...");

		String sentence = noun + " is " + adjective + " that likes to " + verb;
		JOptionPane.showMessageDialog(null, sentence);
	}

}