//RegisterDao.java
package com.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mvc.bean.RegisterBean;
import com.mvc.util.DBConnection;

public class RegisterDao {
	public String registerUser(RegisterBean registerBean) {
		String fullname = registerBean.getFullname();
		System.out.println(fullname + "2");
		String email = registerBean.getEmail();
		String username = registerBean.getUsername();
		String password = registerBean.getPassword();
		Connection con = null;
		System.out.println(con + "1");
		PreparedStatement preparedStatement = null;
		try {
			con = DBConnection.createConnection();
			String query = "insert into users(fullname,email,username,password) values (?,?,?,?)";
			System.out.println(query + "3");	
			
			preparedStatement = con.prepareStatement(query); 
			System.out.println(preparedStatement);
																
			preparedStatement.setString(1, fullname);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, username);
			preparedStatement.setString(4, password);
			System.out.println(preparedStatement);
			
			int i = preparedStatement.executeUpdate();
			if (i != 0) // Just to ensure data has been inserted into the database
				return "SUCCESS";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Oops.. Something went wrong there..!"; // On failure, send a message from here.
	}
}