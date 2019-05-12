package DataBase;
import java.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoDataBase
{
public static void main(String[] args) throws Exception 
{
	String url="jdbc:mysql://localhost:3307/aliens";
	String user="root";
	String password="";
	String query="select * from emp";

	Class.forName("com.mysql.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url, user, password);
	Statement statement = connection.createStatement();
	ResultSet resultSet = statement.executeQuery(query);
	
	String userData=" ";
	
	while(resultSet.next())
	{
		userData=resultSet.getInt(1)+":"+resultSet.getString(2);
		System.out.println(userData);
	}
	statement.close();
	connection.close();
	
	
}
}
