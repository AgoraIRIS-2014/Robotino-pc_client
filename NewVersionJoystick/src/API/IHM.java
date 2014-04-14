package API;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;

public class IHM extends JFrame {
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtSpeed;
	protected JPanel centerPanel;
	
	private java.util.Date date;
	private String adrFile;
	Robot robot1 = new Robot();
	private String ip = "127.0.0.1:8080";
	private float vitesse = 50;
	
	CameraWidget camera = new CameraWidget(robot1);
	//ConsoleWidget console = new ConsoleWidget();
	JComboBox ImgBox = new JComboBox();
	JLabel labelImg = new JLabel("");
	
	public IHM() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 0, 139));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		final Joystick Jjoy = new Joystick(robot1);
		Jjoy.setForeground(Color.LIGHT_GRAY);
		Jjoy.setBackground(Color.WHITE);
		Jjoy.setBounds(88, 44, 249, 244);
		contentPane.add(Jjoy);
		
		Jjoy.setLayout(null);
		JLabel lblJoystick = new JLabel("Joystick :");
		lblJoystick.setFont(new Font("Neuropol", Font.PLAIN, 20));
		lblJoystick.setBounds(10, 224, 98, 20);
		Jjoy.add(lblJoystick);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(10, 44, 68, 68);
		button_8.setIcon(new ImageIcon(IHM.class.getResource("/arrow/rg.png")));
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVelocity(0, 0, 30);
			}

		});
		
		contentPane.setLayout(null);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(10, 44, 68, 68);
		button_9.setIcon(new ImageIcon(IHM.class.getResource("/arrow/rd.png")));
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.setVelocity(0, 0, -30);
			}
		});
		
		contentPane.add(button_9);
		
		textField = new JTextField(ip);
		textField.setBounds(605, 11, 95, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Connexion");
		btnNewButton_1.setBounds(710, 11, 114, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				robot1.connect(textField.getText(), false);
			}
		});
		
		contentPane.add(btnNewButton_1);
		
		JPanel panelcamera = new JPanel();
		panelcamera.setBounds(477, 44, 345, 244);
		panelcamera.setBackground(UIManager.getColor("scrollbar"));
		contentPane.add(panelcamera);
		panelcamera.setLayout(null);
		camera.setBounds(10, 11, 325, 226);
		panelcamera.add(camera);
		
		JLabel lblNewLabel = new JLabel("Vitesse :");
		lblNewLabel.setBounds(354, 174, 61, 14);
		lblNewLabel.setForeground(new Color(192, 192, 192));
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBounds(354, 215, 53, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jjoy.SpeedDown();
				vitesse = vitesse - 10;
				txtSpeed.setText(String.valueOf(vitesse));
			}
		});
		
		contentPane.add(btnNewButton_2);
		
		JButton button_10 = new JButton("+");
		button_10.setBounds(354, 193, 53, 23);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Jjoy.SpeedUp();
				vitesse = vitesse + 10;
				txtSpeed.setText(String.valueOf(vitesse));
			}
		});
		
		contentPane.add(button_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(477, 319, 347, 270);
		panel_2.setBackground(UIManager.getColor("scrollbar"));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		//console.setBounds(5, 5, 340, 240);
		//panel_2.add(console);
		
		JLabel lblConsole = new JLabel("Console :");
		lblConsole.setForeground(new Color(0, 0, 0));
		lblConsole.setBackground(new Color(255, 255, 255));
		lblConsole.setFont(new Font("Neuropol", Font.PLAIN, 20));
		lblConsole.setBounds(15, 245, 98, 24);
		panel_2.add(lblConsole);
		
		setPreferredSize(new Dimension(100, 100));
		setBackground(Color.white);
		
		//objet gérant la pince
		/*
		Voir p.135.
		*/
		
	}
}
