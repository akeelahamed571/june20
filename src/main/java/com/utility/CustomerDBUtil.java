package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.customer.Admin;
import com.customer.DBConnect;



public class CustomerDBUtil {
	private static boolean status; 
	private static Connection con;
	private static Statement stmt;
	private static ResultSet rs;
	
	//validate login
	public static boolean validate(String userName,String password){
		
		
		
		//connect database connection
	
		
		con=DBConnect.connecting();
		
		//validate
		try {
			
			stmt=con.createStatement();
			
			String sql="select * from admin where userName='"+userName +"' and  password='" +password +"' " ;
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				
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
	 public static ArrayList<Admin> getAdminDetails(String userName){
		 ArrayList<Admin> ad=new ArrayList<>();
		//connect database connection
		 Admin c = null;
			
			
			
			//validate
			try {
				con=DBConnect.connecting();
				stmt=con.createStatement();
				//select details
				String sql="select * from admin where userName='"+userName +"' " ;
				rs=stmt.executeQuery(sql);
				
				while(rs.next()) {
					int ID=rs.getInt(1);
					String adminName=rs.getString(2);
					String email=rs.getString(3);
					String phone=rs.getString(4);
					String userN=rs.getString(5);
					String passW=rs.getString(6);
					
					//send data to an object	
					 c=new Admin(ID,adminName,email,phone,userN,passW);
							
							//add object to arraylist*/
					ad.add(c);
					
				}
					
					
			}catch(Exception e) {
				e.printStackTrace();
			}
			return ad;
	 }
	
	
	
	//return status(boolean) after inserting(sign up) to Admin table in DB
    public static boolean insertAdmin(String userName,String password,String email,String  phone,String adminName) {
    	
    	 boolean status=false;
		
    	//connect database connection
    	
    	con=DBConnect.connecting();
    	try {
		
    		stmt=con.createStatement();
    	
    		//insert data
    		String sql="insert into admin values(0,'"+adminName+"','"+email+"','"+phone+"','"+userName+"','"+password+"') ";
    	
    		//returns 0 if  query is failed or 1 for success
    		int rs= stmt.executeUpdate(sql);
        
    		if(rs>0) {
    		status=true;
    		}
    		
    		else{
        	status=false;
    		}
    	
    	
    	}catch (Exception e) {
			
			e.printStackTrace();
		}
		return status; 
    	
    }	
		
	public static boolean editProfile(Admin admin){
		
		
		
		try {
			
			con=DBConnect.connecting();
			stmt=con.createStatement();
		   
		    String sql="update admin set AdminName='"+admin.getCustomerName()+"', email='"+admin.getEmail()+"', phone='"+admin.getPhone()+"', userName='"+admin.getUserName()+"',password='"+admin.getPassword()+"' "
    				+ "where AdminID='"+admin.getCustomerID()+"' ";
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
	
	
	public static boolean deleteAdmin(int ID) {
			try {
			
				con=DBConnect.connecting();
				stmt=con.createStatement();
	        
			    String sql4="delete from admin where adminID='"+ID+"' ";
			    
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
