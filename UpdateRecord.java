package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

@WebServlet("/UpdateRecord")
public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public UpdateRecord() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		       String email=request.getParameter("email");	
		       String mobile=request.getParameter("mobile");
		       
		       System.out.println(email);
		       System.out.println(mobile);
		       
		  PrintWriter out=response.getWriter();
		              out.println(email);
		              out.println(mobile);

		       
		      try
		      {
		    	  Class.forName("com.mysql.cj.jdbc.Driver");
		    	    		   
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student" ,"root","krishnaPat@#123");
		    	java.sql.Statement stmt=con.createStatement();
		    	
		    	stmt.executeUpdate("Update  details set mobile='"+mobile+"' where email='"+email+"'");
		    	            
		    	con.close();
		    	
		      }
             catch(Exception e)
		      {
            	 e.printStackTrace();
		      }

		
		
		
		

	}

}
