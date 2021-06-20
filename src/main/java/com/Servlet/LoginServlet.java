package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.customer.Admin;
import com.utility.CustomerDBUtil;




@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		boolean status;
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
	    
	    
		
		
		
		
		try {
			
			
			//get status passed by DButill validate method
		    status=CustomerDBUtil.validate(userName, password);
		    
		    if(status==true) {
		    	   //get list of  validated details passed by DButill get admin details  method
		    	    ArrayList<Admin>adminDetails=CustomerDBUtil.getAdminDetails(userName);
		    	   
		    	  
		    	   
				   
		    	   request.setAttribute("adminDetails", adminDetails);
				  
				    RequestDispatcher disp1=request.getRequestDispatcher("adminPanel.jsp");
				    disp1.forward(request, response);
				  
				    
		    }
		    else {
		    	      //if not valid display invalid login message
		    	     output.println("<script type='text/javascript'>");
		    	     
		    	     output.println("alert('your password or user name is invalid');  ");
		    	     output.println("location='login.jsp'");
		    	     
		    	     output.println("</script>");
		    	   
				    
		    }
		   
		    
		    
		 
		    
		    
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
     
		
	}

}
