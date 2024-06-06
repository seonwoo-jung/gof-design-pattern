package ch02.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DevilListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("그냥 저질러 버렷!!!");
	}
}
