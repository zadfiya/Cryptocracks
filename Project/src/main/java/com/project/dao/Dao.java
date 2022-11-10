package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dao {
	private String username="root";
	private String password="Nz@123456789";
	private String jdbcUrl ="jdbc:mysql://localhost:3306/cryptocurrencies?userSSL=false";
	
	private static final String SELECT_COIN_BY_ID = "select * from users where id=?;";
	private static final String INSERT_COIN = "INSERT INTO user"+" (name,email,country) VALUES "+" (?,?,?);";
	private static final String UPDATE_COIN="UPDATE user SET name=?,email=?,country=? where id=?;";
	private static final String DELETE_COIN="DELETE from coins where id=?;";
	private static final String SELECT_ALL_COINS="SELECT * from coins";
	
	protected Connection getConnection()
	{
		Connection conn = null;
		try {
		    conn =
		       DriverManager.getConnection(jdbcUrl,username,password);
		    	System.out.print("Successful connected");


		} catch (SQLException ex) {
		    // handle any errors
		    System.out.println("SQLException: " + ex.getMessage());
		    System.out.println("SQLState: " + ex.getSQLState());
		    System.out.println("VendorError: " + ex.getErrorCode());
		} catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
}
