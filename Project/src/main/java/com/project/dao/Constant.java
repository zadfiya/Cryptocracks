package com.project.dao;

public class Constant {
	
	public static String  username="root";
	public static String password="Nz@123456789";
	//public static String password="";
	//public String password="";
	public static String jdbcUrl ="jdbc:mysql://localhost:3306/cryptocurrencies?userSSL=false";
	//public static String jdbcUrl ="jdbc:mysql://localhost:3306/crypto_currency";
	//public String jdbcUrl ="jdbc:mysql://localhost:3306/crypto_currency";
	public static final String API_KEY="1ECF5DD9-61D9-4C52-B8F3-141E36A3FAE4";
	public static final String SELECT_COIN_BY_ID = "select * from coins where id=?;";
	public static final String SELECT_ALL_COINS="SELECT * from coins";
	public static final String SELECT_BOOKMARK_COIN_BY_ID = "select * from bookmarks LEFT JOIN coins ON bookmarks.coinid = coins.id where bookmarks.id=?;";
	public static final String INSERT_COIN = "INSERT INTO bookmarks"+" (coinid,purchasedDate,quantity,purchasedPrice,insertDate,updateDate,name) VALUES "+" (?,?,?,?,?,?,?);";
	public static final String INSERT_COIN_DB = "INSERT INTO coin"+" (name,price,startDate,volume24,icon) VALUES "+" (?,?,?,?,?,);";
	
	public static final String UPDATE_COIN="UPDATE bookmarks SET purchasedDate=?, quantity=?,purchasedPrice=?,updateDate=? where id=?;";
	public static final String DELETE_COIN="DELETE from bookmarks where id=?;";
	public static final String SELECT_ALL_BOOKMARKED_COINS="SELECT * from bookmarks LEFT JOIN coins ON bookmarks.coinid = coins.id";
	
}
