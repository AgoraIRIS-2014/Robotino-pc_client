package robotino;

import java.awt.*;

import javax.swing.*;

public class Joystick {
	
	private JPanel Body;
	private JPanel Control;

	public Joystick() {
		Body = new JPanel();
		Control = new JPanel();
		
		Body.add(Control);
		
		Body.setVisible(true);
		Body.setSize(400, 400);
		Body.setBackground(Color.blue);
		
		Control.setVisible(true);
		Control.setSize(200, 200);
	}
	
}

class Control extends JPanel {
	  public void paintComponent(Graphics g){                
		  int x1 = this.getWidth()/4;
		  int y1 = this.getHeight()/4;                      
		  g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
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


