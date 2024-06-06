package ch02.swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;

	public static void main(String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}

	public void go() {
		frame = new JFrame();

		JButton button = new JButton("할까 말까?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
	}
}
