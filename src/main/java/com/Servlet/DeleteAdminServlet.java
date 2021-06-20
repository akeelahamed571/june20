package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.CustomerDBUtil;

@WebServlet("/DeleteAdminServlet")
public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get and assign values from  DeleteAdmin.jsp
		
		
		String  adminID=request.getParameter("adminID");
		int ID1=Integer.parseInt(adminID);
		
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
		boolean status;
		status=CustomerDBUtil.deleteAdmin(ID1);
		
		if(status==true) {
			//if  valid  deletion display successful deleted message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your account is deleted successfully');  ");
   	     	output.println("location='AdminSignup.jsp'");
   	     
   	     	output.println("</script>");
		}
		else {
			
			//if invalid  deletion display Unsuccessfully deleted message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your account is deletion is Unsuccessful');  ");
   	     	output.println("location='DeleteAdmin.jsp'");
   	     
   	     	output.println("</script>");
		}
		
		
		
		
		
	}

}
