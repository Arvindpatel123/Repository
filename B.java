package p1;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class B {

	public static void main(String[] args) {
		
		
		try
		{
			Scanner s=new Scanner(System.in);
		//	System.out.println("enter the name");
		//	String name=s.next();
		System.out.println("enter the Email id to delete a record");
			String email=s.next();
		//	System.out.println("enter the city");
		//	String city=s.next();
		//	System.out.println("enter the salery");
		//	 String salery=s.next();
		//	 System.out.println("enter the id");
		//	 String id=s.next();
			 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("successfull connection");
			Connection con=
	DriverManager.getConnection("jdbc:mysql://localhost:3306/Companyy","root","krishnaPat@#123");
			System.out.println(con);
			Statement stmt=con.createStatement();
		stmt.executeUpdate("DELETE FROM Employe where email='"+email+"'");
		con.close();
		//	PreparedStatement ps=con.prepareStatement("INSERT INTO Employe values('"+email+"')");
           
		//	ps.executeUpdate("UPDATTE Employe Where email='adarsh@gmail.com'");
		        
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
