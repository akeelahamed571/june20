package com.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.utility.PackageDBUtil;
import com.customer.Packages;

@WebServlet("/UpdatePackageServlet")
public class UpdatePackageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String description=request.getParameter("description");
	    String type=request.getParameter("type");
	    String name=request.getParameter("name");
	    String price=request.getParameter("price");
	    String ID=request.getParameter("ID");
	    
	    PrintWriter output=response.getWriter();
		response.setContentType("text/html");
	    
	    int ID1=Integer.parseInt(ID);
	    Packages p=new Packages(ID1,name,price,type,description);
	    ArrayList<Packages> p1=new ArrayList<>();
	    p1.add(p);
	    boolean status;
	    status=PackageDBUtil.updatePackage(p);

	    
	    if(status==true) {
	    	RequestDispatcher dis=request.getRequestDispatcher("PackageSuccess.jsp");
	    	request.setAttribute("p1", p1);
	    	dis.forward(request, response);
	    	
	    }
	    else {
	    	//if  invalid  update of package display Unsuccessful update message
   	     	output.println("<script type='text/javascript'>");
   	     
   	     	output.println("alert('your Package update is Unsuccessfull');  ");
   	     	output.println("location='UpdatePackage.jsp'");
   	     
   	     	output.println("</script>");
	    }
	}

}
