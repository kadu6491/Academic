import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Login extends JFrame{
	
	private JPanel panel;
	private JLabel iconL;
	private JLabel ic;
	private JPanel pl1;
	private JPanel footer;
	private JButton iconL2;
	private JButton iconL3;
	private JButton iconL4;
	private JButton iconL5;
	
	
	public Login() throws MalformedURLException, IOException {
		super("Academic Login");
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//GridLayout exp = new GridLayout(1,1);
		
		panel   = new JPanel();
		iconL   = new JLabel();
		pl1     = new JPanel();
		footer  = new JPanel();
		iconL2  = new JButton("Student Account");
		iconL3  = new JButton("Faculty Account");
		iconL4  = new JButton("Admin/Staff Account");
		iconL5  = new JButton("Tech Support");
		ic		= new JLabel();
		
		
		JPanel mess = new JPanel();
		
		BufferedImage img = ImageIO.read(new URL(
				"https://www.odu.edu/content/dam/odu/logos/univ"
				        + "/png-72dpi/odu-secondary-white.png"));
		
		Image newImg = img.getScaledInstance(530, 300, 30);
		
		ImageIcon icon = new ImageIcon(newImg);
		iconL.setIcon(icon);
		
		
		/*BufferedImage img2 = ImageIO.read(new URL(
				"https://icon-library.net/images/student-icon-png/"
				+ "student-icon-png-13.jpg"));
		
		Image newImg2 = img2.getScaledInstance(80, 60, 30);
		
		ImageIcon icon2 = new ImageIcon(newImg2);
		iconL2.setIcon(icon2);
		
		BufferedImage img3 = ImageIO.read(new URL(
				"https://img.icons8.com/officel/100/000000"
				+ "/school-director-male-skin-type-6.png"));
		
		Image newImg3 = img3.getScaledInstance(80, 60, 30);
		
		ImageIcon icon3 = new ImageIcon(newImg3);
		iconL3.setIcon(icon3);
		
		
		BufferedImage img4 = ImageIO.read(new URL(
				"https://img.icons8.com/ios-glyphs/100/000000"
				+ "/administrator-female.png"));
		
		Image newImg4 = img4.getScaledInstance(80, 60, 30);
		
		ImageIcon icon4 = new ImageIcon(newImg4);
		iconL4.setIcon(icon4);*/
		
		BufferedImage img2 = ImageIO.read(new URL(
				"https://www.odu.edu/content/dam/odu/admin"
				+ "/univ/img/walllpaper-lion-closeup.jpg"));
		
		Image newImg2 = img2.getScaledInstance((int)(screenSize.width/4.1),
				(int)(screenSize.height/1.4), 30);
		
		ImageIcon icon2 = new ImageIcon(newImg2);
		ic.setIcon(icon2);
		
		//panel.setBackground(new Color(0,0,139));
		
		panel.setLayout(null);
		pl1.setLayout(null);
		
		iconL.setBounds(90, 0, screenSize.width/2, screenSize.height/3);
		
		//pl1.setBackground(new Color(0,0,139));
		//pl1.setBackground(Color.white);
		pl1.setBounds(60,400,500,340);
		pl1.setOpaque(false);
		
		/*mess.setBounds(0, 400, (int)(screenSize.width/3.5), 100);
		mess.setFont(new Font("Lucida Handwriting", 0, 25));
		mess.setBackground(new Color(175,238,238));*/
		
		
		iconL2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginFrame frame;
				try {
					frame = new LoginFrame();
					frame.setVisible(true);
					dispose();
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		
		iconL3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FacultyLogin frame;
				try {
					frame = new FacultyLogin();
					frame.setVisible(true);
					
				
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		
		
		Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
		
		iconL2.setBackground(new Color(255,255,255));
		iconL2.setOpaque(true);
		iconL2.setBorderPainted(false);
		iconL2.setBounds(55, 10, 400, 65);
		iconL2.setFont(new Font("Lucida Handwriting", 0, 25));
		iconL2.setCursor(cursor);
		
		iconL3.setBounds(55, 95, 400, 65);
		iconL3.setBackground(new Color(192,192,192));
		iconL3.setOpaque(true);
		iconL3.setBorderPainted(false);
		iconL3.setFont(new Font("Lucida Handwriting", 0, 25));
		iconL3.setCursor(cursor);
		
		iconL4.setBounds(55, 180, 400, 65);
		iconL4.setBackground(new Color(135,206,250));
		//iconL4.setForeground(Color.white);
		iconL4.setOpaque(true);
		iconL4.setBorderPainted(false);
		iconL4.setFont(new Font("Lucida Handwriting", 0, 25));
		iconL4.setCursor(cursor);
		
		iconL5.setBounds(55, 265, 400, 65);
		iconL5.setBackground(new Color(30,144,255));
		iconL5.setOpaque(true);
		iconL5.setBorderPainted(false);
		iconL5.setFont(new Font("Lucida Handwriting", 0, 25));
		iconL5.setCursor(cursor);
		
		footer.setBackground(new Color(25,25,112));
		
		
		
		
		pl1.add(iconL2);
		pl1.add(iconL3);
		pl1.add(iconL4);
		pl1.add(iconL5);
		ic.add(pl1);
		panel.add(iconL);
		//panel.add(mess);
		
		
		//panel.add(footer);
		add(panel);
		add(ic);
		
		
		
		setSize((int)(screenSize.width/4.1), (int)(screenSize.height/1.4));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		//setResizable(false);
		setVisible(true);
	}
}
