package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.CustomerDBUtil;


@WebServlet("/AdminSignupServlet")
public class AdminSignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String adminName=request.getParameter("adminName");
		
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
		boolean status=CustomerDBUtil.insertAdmin(userName, password, email, phone, adminName);
		
		if (status==true) {
			  //if not valid display successful sign up message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your signup is successful');  ");
   	     	output.println("location='login.jsp'");
   	     
   	     	output.println("</script>");
		}
		
		else {
			  //if not valid display invalid sign up message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your signup is Unsuccessful');  ");
   	     	output.println("location='AdminSignup.jsp' ");
   	     
   	     	output.println("</script>");
		}
		
		
		
		
	}

}
