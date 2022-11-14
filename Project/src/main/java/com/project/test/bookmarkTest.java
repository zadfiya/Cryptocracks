package com.project.test;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.project.dao.Dao;
import com.project.model.Bookmarked;
import com.project.model.Coin;

class bookmarkTest {
	
	Dao coinDao = Dao.getInstance();
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	private void listBookmarkedCoins()
			throws SQLException{
		List<Bookmarked> listBcoins = coinDao.selectALLBookmarkedCoins();
		assertNotEquals(listBcoins,null);
		assertTrue(listBcoins.size()>0);
		
	}
	
	@Test
	public void selectCoin() throws SQLException {
		Bookmarked coin = coinDao.selectBookmarkedCoin(1);
		assertNotEquals(coin,"");
	}
	
	
	
	@Test
	public void updateBookmarkedCoin() throws SQLException{
		Bookmarked bCoin = coinDao.selectBookmarkedCoin(1);
		bCoin.setQuantity(20);
		Boolean val = coinDao.updateCoin(bCoin);
		assertTrue(val);
	}
	
	@Test
	public void deleteBookmark() throws SQLException{
		Boolean val = coinDao.deleteCoin(1);
		Coin coin = coinDao.selectCoin(1);
		assertEquals(coin,null);
	}

}
