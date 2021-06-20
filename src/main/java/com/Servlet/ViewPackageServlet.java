package com.Servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.PackageDBUtil;
import com.customer.Packages;


 
@WebServlet("/ViewPackageServlet")
public class ViewPackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   String ID=request.getParameter("ID");
	   int ID1=Integer.parseInt(ID);
	   Packages pack=PackageDBUtil.getPackageDetails(ID1);
	   ArrayList<Packages> arr2=new ArrayList<> ();
	   arr2.add(pack);
	  
      
	   RequestDispatcher disp=request.getRequestDispatcher("ViewPackages.jsp");
	   request.setAttribute("arr2", arr2);
	   disp.forward(request, response);
	}
	
}
