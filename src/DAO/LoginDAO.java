package DAO;
import java.sql.*;

import Model.Login;
public class LoginDAO
{
	
		 Connection conn;
		 public LoginDAO()throws Exception
		 {
		     Class.forName("org.h2.Driver");
		     conn=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/shopdb","aneesh","password@123");
		 }
		 public boolean isValid(Login loginobj)throws Exception
		 {
			 PreparedStatement psmt=conn.prepareStatement("select * from MyCustomer where custname=? and custpassword=?");
			 psmt.setString(1,loginobj.getLogin().trim());
			 psmt.setString(2,loginobj.getPassword().trim());
			 ResultSet rs=psmt.executeQuery();
			 if(rs.next())
				 return true;
			 else
				 return false;
		 }

}
