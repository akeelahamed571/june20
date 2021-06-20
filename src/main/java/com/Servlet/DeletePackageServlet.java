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

import com.utility.PackageDBUtil;

@WebServlet("/DeletePackageServlet")
public class DeletePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get and assign values from  DeleteAdmin.jsp
	
		String  ID=request.getParameter("packageID");
		int ID1=Integer.parseInt(ID);
		
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
		boolean status;
		status=PackageDBUtil.deletePackage(ID1);
		
		if(status==true) {
			//if  valid  deletion of package display successful deleted message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your package is deleted successfully');  ");
   	     	output.println("location='DeletePackage.jsp'");
   	     
   	     	output.println("</script>");
		}
		else {
			
			//if  invalid  deletion of package display Unsuccessful deleted message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your package is delettion is unsuccessfull');  ");
   	     	output.println("location='DeletePackage.jsp'");
   	     
   	     	output.println("</script>");
		}
		
		
		
		
		
	}

}
