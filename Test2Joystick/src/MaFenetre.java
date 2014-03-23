import java.awt.*;
import javax.swing.*;

/*
*import java.awt.event.MouseEvent;
*import java.awt.event.MouseMotionListener;
*import java.awt.event.MouseAdapter;
*import java.awt.event.MouseListener;
*/

public class MaFenetre extends JFrame {
	  public MaFenetre() {
		    this.setTitle("Joystick");
		    this.setSize(400, 420);
		    this.setLocationRelativeTo(null);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
		    this.setVisible(true);
		    this.setContentPane(new MonPanel());   		    
	  }
	  
	  class MonPanel extends JPanel{
		  	public MonPanel() {		  
		  	}			
		  	public void paintComponent(Graphics g){
				System.out.println("Je suis exécutée !"); 
				int x = getHeight()/2;
				int y = getWidth()/2;
				int a=20;
				int b=300;
				g.fillOval(x-(a/2), y-(a/2), a, a); 
				
				g.drawOval(x-(b/2), y-(150), b, b);
				
				float centreXDesCercles = getWidth()/2;
				System.out.println(centreXDesCercles);
				System.out.println(x);
				System.out.println(y);
			}		  			
	  }
	  
	
	  public static void main(String[] args){
		    MaFenetre fenetre1 = new MaFenetre();
	  } 
}

      

