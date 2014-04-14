package API;
import java.awt.*;
import java.util.*;
import java.util.concurrent.*;

import rec.robotino.com.Bumper;
import rec.robotino.com.Com;
import rec.robotino.com.Gripper;
import rec.robotino.com.Motor;
import rec.robotino.com.OmniDrive;
import rec.robotino.com.Camera;

public class Robot {
	protected final Com com;
	protected final Motor motor1;
	protected final Motor motor2;
	protected final Motor motor3;
	protected final OmniDrive omniDrive;
	protected final Bumper bumper;
	protected final Camera camera;
	protected final Gripper pince;
	
	protected final Collection<RobotListener> listeners;
	
	public Robot() {
		com = new MyCom();
		motor1 = new Motor();
		motor2 = new Motor();
		motor3 = new Motor();
		omniDrive = new OmniDrive();
		bumper = new Bumper();
		camera = new MyCamera();
		pince = new Gripper();
		listeners = new CopyOnWriteArrayList <RobotListener>();
		init();
	}
	
	 protected void init()
	    {
	        motor1.setComId(com.id());
	        motor1.setMotorNumber(0);

	        motor2.setComId(com.id());
	        motor2.setMotorNumber(1);

	        motor3.setComId(com.id());
	        motor3.setMotorNumber(2);

	        omniDrive.setComId(com.id());

	        bumper.setComId(com.id());
	        
	        camera.setComId(com.id());
	        camera.setStreaming(true);
	    }

	 
	 	/*
		public void gererPince(){
	 		  
	 	}
	 	*/
	 
	 	/*public void addListener(RobotListener listener) {
	 		listeners.add(listener);
	 	}*/
	 	
	 	/*public void removeListener(RobotListener listener) {
	 		listeners.remove(listener);
	 	}*/
	 	
	 	public boolean isConnected() {
	 		return com.isConnected();
	 	}
	 	
	 	public void connect (String hostname, boolean block) {
	 		com.setAddress(hostname);
	 		com.connect();
	 	}
	 	
	 	public void disconnect() {
	 		com.disconnect();
	 	}
	 	
	 	public void setVelocity (float vx, float vy, float omega) {
	 		omniDrive.setVelocity(vx, vy, omega);
	 	}
	 	
	 	class MyCom extends Com {
	 		
	 		public void connectedEvent() {
	 			System.out.println("Connected !");
	 			for (RobotListener listener : listeners)
	 				listener.onConnected();
	 		}
	 		
	 		public void errorEvent(Error e, String errorStr) {
	 			System.err.println("Error: " + e.toString());
	 			for (RobotListener listener : listeners)
	 				listener.onError(e);
	 		}
	 		
	 		public void connectionCloseEvent() {
	 			System.out.println("Disconnected !");
	 			for (RobotListener listener : listeners)
	 				listener.onDisconnected();
	 		}
	 		
	 	}
	 	
	 	class MyCamera extends Camera {
	 		public void imageReceivedEvent(Image img, long width, long height, long numChannels, long bitsPerChannel, long step) {
	 			for (RobotListener listener : listeners)
	 				listener.onImageReceived(img);
	 		}
	 	}

}
