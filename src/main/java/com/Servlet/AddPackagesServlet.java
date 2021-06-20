package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.utility.PackageDBUtil;


@WebServlet("/AddPackagesServlet")
public class AddPackagesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String packageName=request.getParameter("packageName");
		String packageType=request.getParameter("packageType");
		String description=request.getParameter("description");
		String price=request.getParameter("price");
		
		PrintWriter output=response.getWriter();
		response.setContentType("text/html");
		
		
		
		boolean status=PackageDBUtil.packageInsert(packageName, price, description, packageType);
		
		if (status==true) {
			//if  valid insertion display success insertion message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('package insertion Success');  ");
   	     	output.println("location='AddPackages.jsp'");
   	     
   	     	output.println("</script>");
		}
		
		else {
			//if  valid insertion display Unsuccess insertion message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('package insertion failed');  ");
   	     	output.println("location='AddPackages.jsp' ");
   	     
   	     	output.println("</script>");
		}
		
	}

}
