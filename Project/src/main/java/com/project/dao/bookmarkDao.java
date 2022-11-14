package com.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.project.model.Bookmarked;

public class bookmarkDao {
	public static bookmarkDao getInstance()
	{
		return new bookmarkDao();
	}
	
	public void insertCoin(Bookmarked coin) throws SQLException{
		try(Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Constant.INSERT_COIN)){
				preparedStatement.setInt(1, coin.getId());
				preparedStatement.setString(2,coin.getPurchasedDate());
				preparedStatement.setDouble(3, coin.getQuantity());
				preparedStatement.setDouble(4, coin.getPurchasedPrice());
				preparedStatement.setTimestamp(5,new Timestamp(System.currentTimeMillis()));
				preparedStatement.setTimestamp(6,new Timestamp(System.currentTimeMillis()));
				preparedStatement.setString(7,coin.getName());
				preparedStatement.execute();}catch(Exception e) {
					e.printStackTrace();
					
		}	
		
	}
	
	public Bookmarked selectBookmarkedCoin(int id) {
		Bookmarked coin = null;
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Constant.SELECT_BOOKMARK_COIN_BY_ID);) {
			preparedStatement.setInt(1, id);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				
				int id1 = rs.getInt("id");
				int coinid=rs.getInt("coinid");

				double purchasedPrice = rs.getDouble("purchasedPrice");
				double quantity = rs.getDouble("quantity");
				String purchasedDate = rs.getString("purchasedDate");
				String insertDate = rs.getString("insertDate");
				String updatedDate = rs.getString("updateDate");
				String name = rs.getString("name");
				coin = new Bookmarked();
				coin.setId(id1);
				coin.setCoinid(coinid);
				coin.setInsertDate(insertDate);
				coin.setPurchasedPrice(purchasedPrice);
				coin.setQuantity(quantity);
				coin.setUpdateDate(updatedDate);
				coin.setPurchasedDate(purchasedDate);
				coin.setName(name);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return coin;
	}
	
	public List<Bookmarked> selectALLBookmarkedCoins() {

		List<Bookmarked> coins = new ArrayList<>();
		try (Connection connection = DBConnection.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(Constant.SELECT_ALL_BOOKMARKED_COINS);) {
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				int id1 = rs.getInt("id");
				int coinid=rs.getInt("coinid");
				double purchasedPrice = rs.getDouble("purchasedPrice");
				double quantity = rs.getDouble("quantity");
				String purchasedDate = rs.getString("purchasedDate");
				String insertDate = rs.getString("insertDate");
				String updatedDate = rs.getString("updateDate");
				String name = rs.getString("name");
				Bookmarked coin = new Bookmarked();
				coin.setId(id1);
				coin.setCoinid(coinid);
				coin.setInsertDate(insertDate);
				coin.setPurchasedPrice(purchasedPrice);
				coin.setQuantity(quantity);
				coin.setUpdateDate(updatedDate);
				coin.setPurchasedDate(purchasedDate);
				coin.setName(name);
				coins.add(coin);
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return coins;
	}
	
	
	public boolean updateCoin(Bookmarked coin) throws SQLException{
		boolean rowUpdated;
		try(Connection connection = DBConnection.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(Constant.UPDATE_COIN);)
		{
				preparedStatement.setInt(5, coin.getId());
				preparedStatement.setString(1,coin.getPurchasedDate());
				preparedStatement.setDouble(2, coin.getQuantity());
				preparedStatement.setDouble(3, coin.getPurchasedPrice());
				preparedStatement.setTimestamp(4,new Timestamp(System.currentTimeMillis()));
				rowUpdated = preparedStatement.executeUpdate()>0;
		}
		return rowUpdated;
	}
	
	public boolean deleteCoin(int id) throws SQLException {
		boolean rowDeleted;
		try (Connection connection = DBConnection.getConnection();
				PreparedStatement statement = connection.prepareStatement(Constant.DELETE_COIN);) {
			statement.setInt(1, id);
			rowDeleted = statement.executeUpdate() > 0;
		}
		return rowDeleted;
	}
	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
	
}
