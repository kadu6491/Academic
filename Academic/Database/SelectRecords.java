import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;  
import java.sql.DriverManager;  
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;  
   
public class SelectRecords{ 
	
    Connection connect() {  
        // SQLite connection string  
        String url = "jdbc:sqlite:Academics.db";  
        Connection conn = null;  
        try {  
            conn = DriverManager.getConnection(url);  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
        return conn;  
    }
    
    public boolean StudentLogin(String u, String p) throws MalformedURLException, IOException {
    	
    	String sql = "SELECT * FROM login Where username = ? and password = ?";
    	
    	//Student st = new Student();
    	
    	try {
    		
    		Connection conn = this.connect();
    		PreparedStatement pr = conn.prepareStatement(sql);
    		
    		pr.setString(1, u);
    		pr.setString(2, p);
    		
    		ResultSet rs = pr.executeQuery();
    		
    		int c = 0;
    		
    		while(rs.next())
    		{
    			c++;
    		}
    		
    		if(c == 1)
    		{
    			Student st = new Student();
    			st.setVisible(true);
    			//dispose();
    			
    			//JOptionPane.showMessageDialog(null, "Student Account");
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "Incorrect username/password");
    			LoginFrame lf = new LoginFrame();
    			
    			lf.setVisible(true);
    		}
		
		
		//dispose();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		return false;
    }
    
    
    public boolean facultyLogin(String u, String p) throws MalformedURLException, IOException {
    	
    	String sql = "SELECT * FROM facultyLogin Where username = ? and password = ?";
    	
    	//Student st = new Student();
    	
    	try {
    		
    		Connection conn = this.connect();
    		PreparedStatement pr = conn.prepareStatement(sql);
    		
    		pr.setString(1, u);
    		pr.setString(2, p);
    		
    		ResultSet rs = pr.executeQuery();
    		
    		int c = 0;
    		
    		while(rs.next())
    		{
    			c++;
    		}
    		
    		if(c == 1)
    		{
    			//Student st = new Student();
    			//st.setVisible(true);
    			//dispose();
    			
    			JOptionPane.showMessageDialog(null, "Faculty Account");
    			
    		}else {
    			JOptionPane.showMessageDialog(null, "Incorrect username/password");
    			LoginFrame lf = new LoginFrame();
    			
    			lf.setVisible(true);
    		}
		
		
		//dispose();
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		return false;
    }
    
    
    
    
}  