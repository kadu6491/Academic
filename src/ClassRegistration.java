import java.awt.*;

import javax.swing.*;

public class ClassRegistration extends JFrame {

	private JPanel rightPanel;
	private JPanel leftPanel;
	
	public ClassRegistration() {
		
		super("Course Registration");
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		//GridLayout gr = new GridLayout(0,2);
		
		setLayout(new GridBagLayout());
		
		
		
		
		
		rightPanel = new JPanel();
		rightPanel.setBackground(Color.cyan);
		rightPanel.setPreferredSize(new Dimension(400, 400));
		gbc.gridx = 1;
		gbc.gridy = 2;
		
		gbc.insets = new Insets(5, 5, 5, 5);
		
		add(rightPanel, gbc);
		
		leftPanel = new JPanel();
		leftPanel.setBackground(Color.BLACK);
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		//gbc.gridheight = 8;
		//gbc.fill = GridBagConstraints.VERTICAL;
		add(leftPanel, gbc);
		
		
		setSize(700, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
	
		new ClassRegistration();
	}
	
}
