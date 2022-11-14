package com.project.dao;

import java.io.IOException;

import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;

import com.squareup.okhttp.OkHttpClient;

import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {

	protected static Connection getConnection()
	{
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn =
		       DriverManager.getConnection(Constant.jdbcUrl,Constant.username,Constant.password);
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
	
	public static void coinDataJson() throws IOException
	{
		OkHttpClient client = new OkHttpClient(); 

		Request request = new Request.Builder()
		  .url("https://rest.coinapi.io/v1/assets")
		  .method("POST",null)
		  .addHeader("X-CoinAPI-Key", Constant.API_KEY)
		  .build();
		
		Response response = client.newCall(request).execute();
		
	
	}
}
