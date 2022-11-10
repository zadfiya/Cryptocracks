package com.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.project.model.Coin;


public class Dao {
	private String username="root";
	private String password="Nz@123456789";
	private String jdbcUrl ="jdbc:mysql://localhost:3306/cryptocurrencies?userSSL=false";
	
	private static final String SELECT_COIN_BY_ID = "select * from users where id=?;";
	private static final String INSERT_COIN = "INSERT INTO coins"+" (name,price,startDate	) VALUES "+" (?,?,?);";
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
	
	public List<Coin> selectAllUsers() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Coin> coins = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_COINS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String startDate = rs.getString("startDate");
				double price = rs.getDouble("price");
				double volume24 = rs.getDouble("volume24");
				coins.add(new Coin(id, name,price,startDate,volume24));
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		    System.out.println("SQLState: " + e.getSQLState());
		    System.out.println("VendorError: " + e.getErrorCode());
		}
		return coins;
	}
}
