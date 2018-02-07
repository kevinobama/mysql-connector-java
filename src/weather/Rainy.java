package weather;
import java.sql.*; 

public class Rainy {
	public static void main(String[] args) {		
		try {  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/robo2_1228?useSSL=false","root","1");  

			//Connection con = this.getConnection();
			
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from users");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  			
			con.close();  
			
		} catch(Exception e) { 
			System.out.println(e);
		} 			 
	}
	
	
	public Connection getConnection() throws SQLException {
	    Connection conn = null;	    	    
        conn = DriverManager.getConnection(
                   "jdbc:mysql://" +
                   "localhost" +
                   ":3306/robo2_1228?useSSL=false",
                   "root","1");
 
	    System.out.println("Connected to database");
	    
	    return conn;
	}
}
