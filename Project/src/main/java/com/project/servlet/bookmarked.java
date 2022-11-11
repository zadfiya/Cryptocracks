package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.Dao;
import com.project.model.Bookmarked;
import com.project.model.Coin;
/**
 * Servlet implementation class bookmarked
 */
@WebServlet("/bookmarked")
public class bookmarked extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Dao bookmarkedDao;
	private Dao coinDao;
	public void init() {
		bookmarkedDao = new Dao();
		coinDao = new Dao();
	}
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public bookmarked() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void listCoins(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Coin> listCoins = coinDao.selectALLCoins();
		request.setAttribute("listCoins", listCoins);
		RequestDispatcher dispatcher = request.getRequestDispatcher("coin-list.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		Bookmarked bookmarkedCoin = bookmarkedDao.selectBookmarkedCoin(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookmark-form.jsp");
		request.setAttribute("bookmarkCoin", bookmarkedCoin);
		dispatcher.forward(request, response);

	}
	
	private void insertCoin(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int coinid = Integer.parseInt(request.getParameter("coinid"));
		double purchasedPrice = Double.parseDouble(request.getParameter("pPrice"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		String purchasedDate = request.getParameter("pDate");
		String insertDate = request.getParameter("insertDate");
		Bookmarked bookmarked = new Bookmarked(coinid,purchasedPrice,quantity,purchasedDate,insertDate);
		bookmarkedDao.insertCoin(bookmarked);
		response.sendRedirect("list");
	}

	private void updateCoin(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ParseException {
		int id = Integer.parseInt(request.getParameter("id"));
		double purchasedPrice = Double.parseDouble(request.getParameter("pPrice"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		String purchasedDate = request.getParameter("pDate");
		String updatedDate = request.getParameter("updatedDate");

		Bookmarked bookmark = new Bookmarked( purchasedPrice, quantity, purchasedDate, updatedDate, id);
		bookmarkedDao.updateCoin(bookmark);
		response.sendRedirect("list");
	}

	private void deleteCoin(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		bookmarkedDao.deleteCoin(id);
		response.sendRedirect("list");

	}
}
