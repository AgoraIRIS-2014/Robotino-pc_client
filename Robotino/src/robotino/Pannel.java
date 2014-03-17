package robotino;

import java.awt.*;
import javax.swing.*;



















































/*import java.awt.Graphics;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class Pannel extends JPanel {
	private int xCenter;
	private int yCenter;
	private int maxYDistenceToCenter;
	private int maxXDistenceToCenter;

	public Pannel() {
		System.out.println("Création d'un Pannel !");      
		this.addMouseLiistener(this);
	} 

	public void paintComponent(Graphics g) {
		Graphics2D g2 =(Graphics2D) g;
		System.out.println("Je suis lancé"); 
		int x1 = this.getWidth()/4;
		int y1 = this.getHeight()/4;                      
		g2.drawOval(x1, y1, getWidth()/2, getHeight()/2);
		g2.fillOval(x1+70, y1+70, getWidth()/7, getHeight()/7);
	} 

	private void addMouseLiistener(Pannel Joy) {
		Joy.addMouseMotionListener(new MouseMotionListener() {
			public void mouseMoved (MouseEvent event) {
				int xRelativeToJoystickCenter = event.getX() - Pannel.this.getXCenter();
				int yRelativeToJoystickCenter = event.getY() - Pannel.this.getYCenter();
				int pourcentageX = (xRelativeToJoystickCenter * 100)/Pannel.this.getMaxXDistenceToCenter();
				int pourcentageY = (yRelativeToJoystickCenter * 100)/Pannel.this.getMaxYDistenceToCenter();
			}

			public void mouseDragged (MouseEvent event){

			}
		});
	}

	public int getXCenter() {
		return xCenter;
	}

	public int getYCenter() {
		return yCenter;
	}

	public void setXCenter(int xCenter) {
		this.xCenter = xCenter;
	}

	public void setYCenter(int yCenter) {
		this.yCenter = yCenter;
	}

	public int getMaxXDistenceToCenter() {
		return maxXDistenceToCenter;
	}

	public void setMaxXDistenceToCenter (int maxXDistenceToCenter) {
		this.maxXDistenceToCenter = maxXDistenceToCenter;
	}

	public int getMaxYDistenceToCenter() {
		return maxYDistenceToCenter;
	}

	public void setMaxYDistenceToCenter (int maxYDistenceToCenter) {
		this.maxYDistenceToCenter = maxYDistenceToCenter;
	}
}*/
