package dbms;

import java.sql.*;
import java.util.Scanner;

public class Resultset {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st= con.createStatement();
			
			ResultSet rs=st.executeQuery("Select *from student");
			while (rs.next()) {
				System.out.println("Roll no: "+rs.getInt("rollno"));
				System.out.println("Name: "+rs.getString("name"));
				System.out.println("Address: "+rs.getString("address"));
		    }
			
		}
		catch(Exception e) {
			System.out.println(e);
		
	}

	}
}
