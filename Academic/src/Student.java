import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.*;



public class Student extends JFrame{
	
	private JPanel panel;
	private JLabel label;
	private JLabel title;
	private JPanel p1;
	private JPanel p2;
	
	private JLabel name;
	private JLabel studID;
	private JLabel degree;
	private JLabel major;
	private JLabel level;
	private JLabel classf;
	
	private JTextField txtN;
	private JTextField txtS;
	private JTextField txtD;
	private JTextField txtM;
	private JTextField txtl;
	private JTextField txtC;
	
	private JButton regBtn;
	private JButton cClassBtn;
	private JButton pClassBtn;
	private JButton proBtn;
	private JButton AdBtn;
	
	private JPanel cpn;

	public Student() throws MalformedURLException, IOException {
		
		super("ODU - Student Academic");
		
		cpn = new JPanel();
		Label a = new Label("\u00a9 Kofi Software Development Inc.");
		//setLayout(null);
		
		panel      = new JPanel();
		label      = new JLabel("Student Main Menu");
		title      = new JLabel();
		p1         = new JPanel();
		p2         = new JPanel();
		
		name       = new JLabel("Name");
		studID     = new JLabel("Student ID ");
		degree     = new JLabel("Degree ");
		major      = new JLabel("Major ");
		level  	   = new JLabel("Level ");
		classf     = new JLabel();
		
		txtN       = new JTextField();
		txtS       = new JTextField();
		txtD   	   = new JTextField();
		txtM   	   = new JTextField();
		txtl   	   = new JTextField();
		txtC   	   = new JTextField();
		
		regBtn     = new JButton("Register for Class");
		cClassBtn  = new JButton("Fall 2019 Classes");
		pClassBtn  = new JButton("Previous Semester Courses");
		proBtn     = new JButton("View Academic Progress");
		AdBtn	   = new JButton("Your Advisor Info");
		
		
		
		txtN.setText(" ADUTWUM, KOFI");
		txtS.setText("********");
		txtD.setText("BSCS");
		txtM.setText("Computer Science");
		txtl.setText("UG");
		
		
		
		panel.setBackground(new Color(25,25,112));
		
		
		panel.setLayout(new BorderLayout());
		panel.setLayout(null);
		
		BufferedImage img = ImageIO.read(new URL(
		        "https://www.odu.edu/content/dam/odu/logos/univ"
		        + "/png-72dpi/odu-sig-noidea-reversed.png"));
		
		Image newImg = img.getScaledInstance(500, 200, 30);
		
		ImageIcon icon = new ImageIcon(newImg);
		
		
		
		title.setForeground(new Color(176,224,230));
		title.setFont(new Font("Ubuntu", 1, 800));
		title.setBounds(250, 1, 500, 300);
		
		title.setIcon(icon);
		
		
		
		p1.setBackground(new Color(240,248,255));
		p1.setBounds(0, 400, 1000, 600);
		
		p2.setBackground(Color.cyan);
		p2.setBounds(0, 300, 1000, 100);
		p2.setFont(new Font("Ubuntu", 1, 80));
		
		p2.setLayout(new BorderLayout());
		//p1.setLayout(new BorderLayout());
		p1.setLayout(null);
		cpn.setLayout(null);
		
		label.setForeground(new Color(0,0,205));
		label.setFont(new Font("Ubuntu", 1, 30));
		label.setBounds(350, 3, 450, 100);
		
		name.setFont(new Font("Ubuntu", 1, 25));
		name.setBounds(60, -30, 140, 100);
		
		studID.setFont(new Font("Ubuntu", 1, 25));
		studID.setBounds(250, -30, 150, 100);
		
		degree.setFont(new Font("Ubuntu", 1, 25));
		degree.setBounds(444, -30, 140, 100);
		
		major.setFont(new Font("Ubuntu", 1, 25));
		major.setBounds(645, -30, 140, 100);
		
		level.setFont(new Font("Ubuntu", 1, 25));
		level.setBounds(835, -30, 140, 100);
		
		classf.setFont(new Font("Ubuntu", 1, 25));
		classf.setBounds(60, -30, 140, 100);
		
		txtN.setBounds(3, 40, 200, 40);
		//txtN.setPreferredSize(new Dimension(150, 35));
		txtN.setBackground(new Color(232,232,232));
		txtN.setFont(new Font("Courier New", 0, 17));
		
		
		txtS.setBounds(240, 40, 155, 40);
		txtS.setBackground(new Color(232,232,232));
		txtS.setFont(new Font("Courier New", 0, 17));
		
		txtD.setBounds(440, 40, 100, 40);
		txtD.setBackground(new Color(232,232,232));
		txtD.setFont(new Font("Courier New", 0, 17));
		
		txtM.setBounds(580, 40, 200, 40);
		txtM.setBackground(new Color(232,232,232));
		txtM.setFont(new Font("Courier New", 0, 17));
		
		txtl.setBounds(820, 40, 100, 40);
		txtl.setBackground(new Color(232,232,232));
		txtl.setFont(new Font("Courier New", 0, 17));
		
		   regBtn.setBounds(45, 100, 900, 50);
		cClassBtn.setBounds(45, 180, 900, 50);
		pClassBtn.setBounds(45, 260, 900, 50);
		   proBtn.setBounds(45, 340, 900, 50);
		    AdBtn.setBounds(45, 420, 900, 50);
		    
		    regBtn.setFont(new Font("Helvetica CY", 1, 19));
		 cClassBtn.setFont(new Font("Helvetica CY", 1, 19));
		 pClassBtn.setFont(new Font("Helvetica CY", 1, 19));
		    proBtn.setFont(new Font("Helvetica CY", 1, 19));
		    AdBtn.setFont(new Font("Helvetica CY", 1, 19));
		 
		
		cpn.setBackground(new Color(25,25,112));
		cpn.setBounds(0, 520, 1000, 60);
		
		a.setForeground(new Color(230,230,250));
		a.setFont(new Font("Gill Sans", 1, 25));
		a.setBounds(300, 5, 900, 50);
		
		cpn.add(a);
		
		p2.add(name);
		p2.add(txtN);
		p2.add(studID);
		p2.add(txtS);
		p2.add(degree);
		p2.add(txtD);
		p2.add(major);
		p2.add(txtM);
		p2.add(level);
		p2.add(txtl);
		p2.add(classf);
		
		p1.add(label);
		
		p1.add(regBtn);
		p1.add(cClassBtn);
		p1.add(pClassBtn);
		p1.add(proBtn);
		p1.add(AdBtn);
		
		p1.add(cpn);
		
		panel.add(title);
		panel.add(p2);
		panel.add(p1);
		
		
		
		add(panel);
		
		
		txtN.setEditable(false);
		txtS.setEditable(false);
		txtD.setEditable(false);
		txtM.setEditable(false);
		txtl.setEditable(false);
		txtC.setEditable(false);
		
		setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setSize(1000, 1000);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		try {
		new Student();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
