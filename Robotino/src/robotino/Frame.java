package robotino;

import java.awt.*;

import javax.swing.*;

public class Frame extends JFrame {
	public Frame() {
		
		JPanel Body = new JPanel();
		JPanel Control = new JPanel();
		
		Body.add(Control);
		
		Body.setVisible(true);
		Body.setSize(400, 400);
		Body.setBackground(Color.blue);
		
		Control.setVisible(true);
		Control.setSize(200, 200);
		
		this.setTitle("GUI");
		this.setSize(1200, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setContentPane(Body);
	}
	
}
