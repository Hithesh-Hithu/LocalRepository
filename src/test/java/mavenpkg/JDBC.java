package mavenpkg;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class JDBC {
	
	@Test
	public void ru() throws ClassNotFoundException 
	{
		String dbURL="jdbc:mysql://localhost:3306/hithu"; ///this is path of the database
		
		Class.forName("com.mysql.cj.jdbc.Driver");//connector file path to db(Here we need to mention the path the driver class 
		//driver class is used to connect the eclipse and database)
		
		
		try {
			DriverManager.getConnection(dbURL,"root","root");
			
			System.out.println("Connection established");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Connection not established");

		}
		

	}
	

}
