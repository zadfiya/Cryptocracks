package com.project.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;


import org.junit.jupiter.api.Test;

import com.project.dao.Dao;
import com.project.model.Coin;
class coinTest {
	Dao coinDao = Dao.getInstance();
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	private void listCoins()
			throws SQLException{
		List<Coin> listCoins = coinDao.selectALLCoins();
		assertNotEquals(listCoins,null);
		assertTrue(listCoins.size()>0);
		
	}
	
	public void selectCoin() throws SQLException {
		Coin coin = coinDao.selectCoin(1);
		assertNotEquals(coin,"");
	}
	
	
	
	
	
	
}
