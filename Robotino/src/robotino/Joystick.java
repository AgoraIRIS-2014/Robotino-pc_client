package robotino;

import java.awt.*;

import javax.swing.*;

public class Joystick {
	
	private JPanel Body;
	private JPanel Control;

	public Joystick() {
		Body = new JPanel();
		Control = new JPanel();
		
		
		Body.setBackground(Color.blue);
		Control.setBackground(Color.gray);
		Body.setVisible(true);
		Control.setVisible(true);
		Body.add(Control);
	}
}

/*import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Joystick extends JFrame {
	private Pannel pan = new Pannel();
	public Joystick() {                
		this.setTitle("RobotinoJoystick");
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);      
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(pan);
		this.setVisible(true);

		go();
	}

	private void go() {
		for (int i = -50; i < pan.getWidth(); i++) {
			int x = pan.getXCenter(), y = pan.getYCenter();
			x++;
			y++;
			pan.setXCenter(x);
			pan.setYCenter(y);
			pan.repaint();

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}      */


