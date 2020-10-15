import java.awt.event.ActionEvent;
import java.sql.*;  
import java.util.*;  
   
public class InsertRecords {  
   
    private Connection connect() {  
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
   
  
    public void insert(int id, String fname, String lname, int dob) {  
        
    	
    	
    	String sql = "INSERT INTO students(id, fname, lname, dob) VALUES(?,?,?,?)";  
   
        try{  
            Connection conn = this.connect();  
            PreparedStatement pstmt = conn.prepareStatement(sql);  
            pstmt.setInt(1, id);  
            pstmt.setString(2, fname);
            pstmt.setString(3, lname);
            pstmt.setInt(4, dob);
            pstmt.executeUpdate();  
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }  
    }
    
   
    public static void main(String[] args) { 
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter DOB: ");
    	int don = sc.nextInt();
    	
    	//System.out.println(name);
    	
   
        InsertRecords app = new InsertRecords();  
        // insert three new rows  
        app.insert(12345, "pak" , "Adutwum", don); 
      
          
    }


   
}  