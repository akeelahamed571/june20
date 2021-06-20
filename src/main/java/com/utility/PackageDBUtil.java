package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Packages;

public class PackageDBUtil {
	
	
	
	private static ResultSet rs;
	public static boolean packageInsert(String packageName,String  price,String  description,String  packageType) {
		boolean status=false; 
		 String url="jdbc:mysql://localhost:3306/hotel";
		 String password="akeel123@";
		 String userName="root";
		 
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, userName, password);
    		Statement stmt=con.createStatement();
    		
    		//insert data
    		String sql="insert into packages values(0,'"+packageName+"','"+price+"','"+description+"','"+packageType+"') ";
    	    int rs=stmt.executeUpdate(sql);
    	    
    	    if(rs>0) {
    	    	status=true;
    	    }
		
    	    else {
    	    	status=false;
    	    }
    	}
		 catch(Exception e) {
			  e.printStackTrace();
		  }
		 
		
		return status;
		
	}
	
			
	
	public static  boolean updatePackage(Packages pack) {
		 String url="jdbc:mysql://localhost:3306/hotel";
		 String password="akeel123@";
		 String userName="root";
		 boolean stat = false;
		 try {
	    		Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection(url, userName, password);
				Statement stmt=con.createStatement();	
				
				//update data
				String sql7="update packages set description='"+ pack.getDescription()+"' ,packageType='"+pack.getPackageType()+"'  ,packageName='"+pack.getPackageName()+"'  ,price='"+pack.getPrice()+"' "+"where packageID='"+pack.getPackageID()+"'";
				int rs7=stmt.executeUpdate(sql7);
				if(rs7>0) {
					stat=true;
				}
				else {
					stat=false;
				}
				
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 return stat;
	}
	
	
   public static Packages getPackageDetails(int ID){
	   Packages pack = null;
	   String url="jdbc:mysql://localhost:3306/hotel";
	   String password="akeel123@";
	   String userName="root";
		 
  	try {
  		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url, userName, password);
  		Statement stmt=con.createStatement();
  		
  		//select data
  		String sql="select * from packages where packageID='"+ID+"'";
  		ResultSet rs=stmt.executeQuery(sql);
  		
  		if(rs.next()) {
  			
  			int ID1=rs.getInt(1);
  			String packageName=rs.getString(2);
  			String price=rs.getString(3);
  			String description=rs.getString(4);
  			String type=rs.getString(5);
  			
  			pack=new Packages(ID1, packageName, price, description, type);
  			
  			
  		}
  		}catch(Exception e) {
  			e.printStackTrace();
  		}
	   return pack;
   }
   
   public static List<Packages> getAllPackages(){
	   
	   List<Packages> pack1=new ArrayList<>();
	   String url="jdbc:mysql://localhost:3306/hotel";
	   String password="akeel123@";
	   String userName="root";
		 
  	   try {
  		  Class.forName("com.mysql.jdbc.Driver");
		  Connection con=DriverManager.getConnection(url, userName, password);
  		  Statement stmt=con.createStatement();
  		
  		  //select data
	      String sql8="select * from packages";
	      rs=stmt.executeQuery(sql8);
	   
	       while(rs.next()) {
	    	   int ID=rs.getInt(1);
	    	   String name=rs.getString(2);
	    	   String price=rs.getString(3);
	    	   String description =rs.getString(4);
	    	   String type=rs.getString(5);
		   
		   
	    	   pack1.add(new Packages(ID,name,price,description,type));
		   
	       }
	   
       } catch(Exception e) {
	              e.printStackTrace();
       }
  	
  	   return pack1;
   }
   
   
   
   public static boolean deletePackage(int ID) {
	   boolean status=false;
	   
	   String url="jdbc:mysql://localhost:3306/hotel";
	   String password="akeel123@";
	   String userName="root";
		 
  	   try {
  		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection(url, userName, password);
  		    Statement stmt=con.createStatement();
		    String sql4="delete from packages where packageID='"+ID+"' ";
		    
		    int rs=stmt.executeUpdate(sql4);
		   
		    if(rs>0) {
		    	status=true;
		    }
		    
		    else {
		    	status=false;
		    }
		    
		    
		    
		}catch(Exception e) {
				e.printStackTrace();
		}
		
		return status;
	
	
 }

   
   
   
   
   
}
