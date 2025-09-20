package dbms;
import java.sql.*;
public class Javaconnect {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			Statement st= con.createStatement();
			String str="create database demo";
			st.executeUpdate(str);
			System.out.println("database is created");
		}
		catch(Exception e) {
			System.out.println(e);
		

	}

}
}
