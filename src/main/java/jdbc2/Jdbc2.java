package jdbc2;
import java.sql.*;
public class Jdbc2 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc2","root","root");
		CallableStatement p=c.prepareCall("insert into marks values('nammu',96,2024)");
		boolean e=p.execute();
		System.out.println(e);
		c.close();
	}
}
