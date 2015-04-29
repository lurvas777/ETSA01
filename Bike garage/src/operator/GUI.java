package operator;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {

	public GUI() {
		JFrame frame = new JFrame("GUI for operator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.add(panel);
		
		
		frame.setPreferredSize(new Dimension(200,200));
		frame.pack();
		frame.setVisible(true);
	}
}
