package jdbc1;
import java.sql.*;
import java.util.*;
public class Jdbc1 {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Jdbc1","root","root");
		CallableStatement p=c.prepareCall("insert into details values(?,'nammu',?)");
		Scanner sc=new Scanner(System.in);
		p.setInt(1, sc.nextInt());
		p.setInt(2,sc.nextInt());
		int e=p.executeUpdate();
		System.out.println(e);
		c.close();
	}
}
