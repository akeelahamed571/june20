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
import javax.servlet.http.HttpSession;

import com.customer.Admin;
import com.utility.CustomerDBUtil;



@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("userName");
		String password=request.getParameter("password");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		String adminName=request.getParameter("name");
		
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
		
		
		String ID=request.getParameter("adminID");
		int ID1=Integer.parseInt(ID);
		Admin admin=new Admin(ID1,adminName,email,phone,username,password);
       
		boolean status;
		status=CustomerDBUtil.editProfile(admin);
		
		
		if(status==true) {
			//if  valid  updation of admin display successful updated message
			
			output.println("<script type='text/javascript'>");
	   	     
   	     	output.println("alert('your profile is updated  successfully');  ");
   	     	output.println("location='editProfile.jsp' ");
   	     
   	     	output.println("</script>");
		}
		else {
			//if  invalid  updation of admin display Unsuccessful updated message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your profile is updation is Unsuccessfull');  ");
   	     	output.println("location='editProfile.jsp' ");
   	     
   	     	output.println("</script>");
		}
	}

}
