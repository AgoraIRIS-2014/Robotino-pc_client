package robotino;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class Joystick extends JFrame {
	private Pannel pan = new Pannel();
	public Joystick() {                
		this.setTitle("RobotinoJoystick");
		this.setSize(600, 600);
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
}      


