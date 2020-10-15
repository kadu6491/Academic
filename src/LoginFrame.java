import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;


import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;

public class LoginFrame extends JFrame {
	
	private JPanel panel;
	private JPanel panel2;
	private JLabel pic;
	
	private JLabel Usrpic;
	private JLabel Pwdpic;
	private JLabel top;
	
	private JTextField usrField;
	private JPasswordField pwdField;
	private JButton login;
	private JButton cancel;
	private JButton forgot;
	private JButton back;
	
	public LoginFrame() throws MalformedURLException, IOException {
		
		super("Student Login");
		
		//GridLayout gr = new GridLayout(0, 2);
		
		setLayout(null);
		
		panel 	 = new JPanel();
		panel2 	 = new JPanel();
		pic 	 = new JLabel();
		Usrpic 	 = new JLabel();
		Pwdpic 	 = new JLabel();
		top 	 = new JLabel();
		
		usrField = new JTextField();
		pwdField = new JPasswordField();
		login	 = new JButton("Login");
		cancel	 = new JButton("Exit");
		forgot	 = new JButton("Forgot your password?");
		back 	 = new JButton("\t Exit");
		
		
		//Left Image
		BufferedImage im = ImageIO.read(new URL("https://www.odu.edu/about/connect/wallpaper/"
				+ "_jcr_content/par/columns_1014265088/column_0/image.img.520.jpg/1532539570310.jpg"));
		Image im2 = im.getScaledInstance(400, 753, 30);
		ImageIcon icon = new ImageIcon(im2);
		
		//Top Icon Image
		BufferedImage topImg = ImageIO.read(new URL("https://www.odu.edu/content/dam/"
				+ "odu/logos/univ/png-72dpi/odu-secondary-noidea-fullcolor.png"));
		Image topIm2 = topImg.getScaledInstance(190, 150, 30);
		ImageIcon topicon = new ImageIcon(topIm2);
		top.setIcon(topicon);
		
		//Username Icon
		BufferedImage usrImg = ImageIO.read(new URL("https://tinysurprise.com/media/"
				+ "testimonials/image/userimage.png"));
		Image usrIm2 = usrImg.getScaledInstance(40, 40, 30);
		ImageIcon Usricon = new ImageIcon(usrIm2);
		
		//Password Icon
		BufferedImage pwdImg = ImageIO.read(new URL("https://lh3.googleusercontent.com"
				+ "/3zjXuqycyzoImG0uITV4_wS5xvEJtI7b4ksfhjlusW9xq8taaYkXqHFMiqfq2-HwcJJl"));
		Image pwdImg2 = pwdImg.getScaledInstance(40, 40, 30);
		ImageIcon pwdicon = new ImageIcon(pwdImg2);
		
		//Back Icon
		BufferedImage bImg = ImageIO.read(new URL("http://aux.iconspalace.com/"
				+ "uploads/135210286.png"));
		Image bImg2 = bImg.getScaledInstance(40, 40, 30);
		ImageIcon bicon = new ImageIcon(bImg2);
		
		panel.setLayout(null);
		
		
		login.addActionListener(new ActionListener() {
			
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					
					SelectRecords sr = new SelectRecords();
					
					try {
						sr.StudentLogin(usrField.getText(), pwdField.getText());
						dispose();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				
			}
		});
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Login login;
				try {
					login = new Login();
					login.setVisible(true);
					dispose();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		
		pic.setIcon(icon);
		pic.setBounds(550, 0, 400, 750);
		
		Usrpic.setIcon(Usricon);
		Usrpic.setBounds(130, 250, 150, 150);
		
		usrField.setBounds(180, 310, 200, 35);
		usrField.setFont(new Font("Courier New", 0, 17));
		usrField.setOpaque(false);
		usrField.setBackground(new Color(0,0,0,20));
		
		Pwdpic.setIcon(pwdicon);
		Pwdpic.setBounds(130, 320, 150, 150);
		
		pwdField.setBounds(180, 380, 200, 35);
		pwdField.setFont(new Font("Courier New", 0, 17));
		pwdField.setOpaque(false);
		pwdField.setBackground(new Color(0,0,0,20));
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		login.setBounds(180, 450, 200, 45);
		login.setFont(new Font("Helvetica CY", 0, 18));
		login.setOpaque(true);
		login.setBackground(new Color(30,144,255));
		login.setBorderPainted(false);
		login.setCursor(cursor);
		
		//cancel.setBounds(250, 400, 100, 45);
		//cancel.setFont(new Font("Helvetica CY", 0, 15));
		
		forgot.setBounds(175, 510, 220, 45);
		forgot.setBorderPainted(false);
		forgot.setCursor(cursor);
		forgot.setFont(new Font("Helvetica CY", 0, 15));
		
		back.setBounds(2, 20, 100, 45);
		back.setBorderPainted(false);
		back.setCursor(cursor);
		back.setFont(new Font("Helvetica CY", 0, 15));
		back.setIcon(bicon);
		
		top.setBounds(180, 80, 300, 200);
		
		
		panel.setBackground(new Color(240,248,255));
		panel.setBounds(0, 0, 550, 750);
		
		panel2.setBackground(new Color(242, 241, 239));
		panel2.setBounds(550, -5, 400, 750);
		
		
		
		panel2.add(pic);
		
		panel.add(back);
		panel.add(top);
		panel.add(Usrpic);
		panel.add(usrField);
		panel.add(Pwdpic);
		panel.add(pwdField);
		
		panel.add(login);
		panel.add(cancel);
		panel.add(forgot);
		
		add(panel);
		add(panel2);
		
		setSize(950, 750);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public void StudentLogin() throws MalformedURLException, IOException {
		
		
    	
		
	}
	
	
}
