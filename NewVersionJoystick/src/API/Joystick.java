package API;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

import javax.swing.*;

public class Joystick extends JPanel {
	int sizeX = 248, sizeY = 228;
	float vitesse = 50;
	JPanel mainPanel, pan0, pan1, pan2, pan3, pan4, pan5, pan6, pan7, pan8;
	cercle cerclePan, cercleCurs;
	
	public Joystick(final Robot robot1) {
		cercleCurs = new cercle(83, 75, 82, 82, 210, 0, 0);
		cerclePan = new cercle(0, 0, 249, 228, 0, 0, 0);
		
		cerclePan.setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setSize(sizeX, sizeY);
		this.add(cercleCurs);
		this.add(cerclePan);
		
		cerclePan.add(mainPanel);
		mainPanel.setBackground(new Color(0, 0, 0, 0));
		
		pan0 = new JPanel();
		pan1 = new JPanel();
		pan2 = new JPanel();
		pan3 = new JPanel();
		pan4 = new JPanel();
		pan5 = new JPanel();
		pan6 = new JPanel();
		pan7 = new JPanel();
		pan8 = new JPanel();

		mainPanel.setLayout(new GridLayout(3, 3));
		
		pan0.setBackground(new Color(0, 0, 0, 0));
		pan1.setBackground(new Color(0, 0, 0, 0));
		pan2.setBackground(new Color(0, 0, 0, 0));
		pan3.setBackground(new Color(0, 0, 0, 0));
		pan4.setBackground(new Color(0, 0, 0, 0));
		pan5.setBackground(new Color(0, 0, 0, 0));
		pan6.setBackground(new Color(0, 0, 0, 0));
		pan7.setBackground(new Color(0, 0, 0, 0));
		pan8.setBackground(new Color(0, 0, 0, 0));
		
		mainPanel.add(pan0);
		mainPanel.add(pan1);
		mainPanel.add(pan2);
		mainPanel.add(pan3);
		mainPanel.add(pan4);
		mainPanel.add(pan5);
		mainPanel.add(pan6);
		mainPanel.add(pan7);
		mainPanel.add(pan8);
		
		pan0.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan0.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(-60, -50);
				robot1.setVelocity(vitesse, vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(-60, -50);
				robot1.setVelocity(vitesse, vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan1.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan1.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(0, -73);
				robot1.setVelocity(vitesse, 0, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(0, -73);
				robot1.setVelocity(vitesse, vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan2.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan2.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(60, -50);
				robot1.setVelocity(vitesse, vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(60, -50);
				robot1.setVelocity(vitesse, -vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan3.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan3.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(-83, 0);
				robot1.setVelocity(0, vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(-83, 0);
				robot1.setVelocity(0, vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan4.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan4.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan5.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan5.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(83, 0);
				robot1.setVelocity(0, -vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(83, 0);
				robot1.setVelocity(0, -vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan6.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan6.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(-60, 50);
				robot1.setVelocity(-vitesse, vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(-60, 50);
				robot1.setVelocity(-vitesse, vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan7.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan7.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(0, 73);
				robot1.setVelocity(-vitesse, 0, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(0, 73);
				robot1.setVelocity(-vitesse, 0, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan8.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
		
		pan8.addMouseListener(new MouseListener() {
			public void mouseClicked(MouseEvent e) {}
			public void mousePressed(MouseEvent e) {
				cercleCurs.setLocation(60, 50);
				robot1.setVelocity(-vitesse, -vitesse, 0);
			}
			
			public void mouseReleased(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
			
			public void mouseEntered(MouseEvent e) {
				cercleCurs.setLocation(60, 50);
				robot1.setVelocity(-vitesse, -vitesse, 0);
			}
			
			public void mouseExited(MouseEvent e) {
				cercleCurs.setLocation(0, 0);
				robot1.setVelocity(0, 0, 0);
			}
		});
	}
	
	public void SpeedUp() {
		vitesse = vitesse+10;
	}
	
	public void SpeedDown() {
		vitesse = vitesse-10;
	}
	
	public class cercle extends JPanel {
		int posx, posy, lar, lon, r, v, b;
		
		public void paint(Graphics g) {
			g.setColor(new Color(r,v,b));
			g.fillOval(posx, posy, lar, lon);
		}
		
		public cercle (int x, int y, int largeur, int longueur, int R, int V, int B){
			lar = largeur;
			lon = longueur;
			r = R;
			v = V;
			b = B;
			posx = x;
			posy = y;
			this.setSize(248, 228);
		}
	}

}
