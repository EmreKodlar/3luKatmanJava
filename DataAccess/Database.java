package DataAccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	
Connection c=null;
	
	public Database(){}
	
	public Connection connDb() {
		
		try {
			
			this.c= DriverManager.getConnection("jdbc:mysql://ns40.kebirhost.com/wwwajan_barkod","***","***");
 
			return c;
		} 
		
		
		catch (SQLException e)
		
		{
			 
			e.printStackTrace();
		}
		
		return  c;
	}

}
