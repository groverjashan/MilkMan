package PaymentCollecton;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
	static Connection doConnect()
	{
		Connection con=null; //LRV
		try {
			
			 Class.forName("com.mysql.jdbc.Driver");
			 //														    databaseName      password
			 con=	DriverManager.getConnection("jdbc:mysql://localhost/records","root","bce");
			 System.out.println("Connected");
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) 
	{
		doConnect();

	}

}