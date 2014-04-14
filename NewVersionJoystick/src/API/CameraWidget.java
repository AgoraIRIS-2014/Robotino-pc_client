package API;

import java.awt.*;
import javax.swing.*;
import rec.robotino.com.Com.Error;

public class CameraWidget extends JComponent {
	private volatile Image cameraImg;
	
	public CameraWidget(Robot robot) {
		//robot.addListener(new RobotListenerImpl());
		setMinimumSize(new Dimension(32, 24));
		setPreferredSize(new Dimension(320, 240));
		setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
		setDoubleBuffered(true);
	}
	
	protected void paintComponent(Graphics g) {
		if(cameraImg != null) {
			g.drawImage(cameraImg, 0, 0, getWidth(), getHeight(), null);
		} else {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, getWidth()	, getHeight());
			g.setColor(Color.WHITE);
			g.drawString("Aucune Image", getWidth()/2 - 60, getHeight()/2);
		}
	}
	
	public Image getCameraImage() {
		return cameraImg;
	}
	
	private class RobotListenerImpl implements RobotListener {
		public void onImageReceived(Image img) {
			cameraImg = img;
			repaint();
		}
		
		public void onConnected() {}
		public void onDisconnected() {}
		public void onError(Error error) {}
	}
}
