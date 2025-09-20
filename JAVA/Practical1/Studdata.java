package dbms;
import java.sql.*;
import java.util.*;

public class Studdata {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			Statement st= con.createStatement();
			//String str="create table student(rollno int, name varchar(20),address varchar(20)) ";
			//st.executeUpdate(str);
			//System.out.println("Table is created");
			
			Scanner sc=new Scanner(System.in);
			int r;
			String n;
			String addr;
			
			System.out.println("Enter Roll no :");
			r=sc.nextInt();
			System.out.println("Enter Name :");
			n=sc.next();
			System.out.println("Enter Address :");
			addr=sc.next();
			
			String str="insert into student values("+r+",'"+n+"','"+addr+"')";
			st.executeUpdate(str);
			
			System.out.println("Data inserted successfully");
			
		}
		catch(Exception e) {
			System.out.println(e);
		

	}

	}

}
