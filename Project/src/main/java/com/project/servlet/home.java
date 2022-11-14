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
 * Servlet implementation class home
 */
@WebServlet("/")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao coinDao,bookmarkedDao;
	public void init() {
		coinDao = new Dao();
		bookmarkedDao = new Dao();
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String action = request.getServletPath();
		//System.out.println(action+" 33333");
		
		try {
			switch (action) {
			case "/coinlist":
				listCoins(request, response,1);
				break;
			case "/insert":
				insertCoin(request,response);
				break;
			case "/addcoin":
				addNewCoin(request,response);
				break;
			case "/delete":
				deleteCoin(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
//			case "/update":
//				updateCoin(request,response);
//				break;
			case "/bookmarklist":
				listBookmarkedCoins(request,response);
				break;
			default:
				listCoins(request, response,0);
				break;
			}
		}catch(SQLException e)
		{
			throw new ServletException(e);
		} 
//		catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		try {
			switch (action) {
			case "/insert":
				insertCoin(request,response);
				//System.out.println("abcd....");
//				addtoBookmark(request, response);
				break;
			case "/addcoin":
				addNewCoin(request,response);
				break;
			case "/delete":
				deleteCoin(request, response);
				break;
			case "/edit":
				showEditForm(request, response);
				break;
			case "/update":
				updateCoin(request,response);
				break;
			case "/bookmarklist":
				listBookmarkedCoins(request,response);
				break;
			default:
				listCoins(request, response,0);
				break;
			}
		}catch(SQLException e)
		{
			throw new ServletException(e);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void listCoins(HttpServletRequest request, HttpServletResponse response,int flag)
			throws SQLException, IOException, ServletException {
		List<Coin> listCoins = coinDao.selectALLCoins();
		if(flag==0 && listCoins.size()>10)
			listCoins = listCoins.subList(0, 11);
		request.setAttribute("listCoins", listCoins);
		RequestDispatcher dispatcher = request.getRequestDispatcher("coin.jsp");
		dispatcher.forward(request, response);
	}
	
	
	private void listBookmarkedCoins(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Bookmarked> listCoins = coinDao.selectALLBookmarkedCoins();
		request.setAttribute("listCoins", listCoins);
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookmark-list.jsp");
		dispatcher.forward(request, response);
	}
	
	private void addNewCoin(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("coinid"));
		Coin coin = coinDao.selectCoin(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookmark-form.jsp");
		request.setAttribute("coin",coin );
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
		
		int coinid = Integer.parseInt((String) request.getParameter("coinid"));
		String name = request.getParameter("name");
		double purchasedPrice = Double.parseDouble((String) request.getParameter("pPrice"));
		double quantity = Double.parseDouble((String) request.getParameter("quantity"));
		String purchasedDate = (String) request.getParameter("pDate");		
		String insertDate = (String) request.getAttribute("insertDate");
		Bookmarked bookmarked = new Bookmarked(coinid,purchasedPrice,quantity,purchasedDate,insertDate);
		bookmarked.setName(name);
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
		response.sendRedirect("bookmarklist");
	}

	private void deleteCoin(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		bookmarkedDao.deleteCoin(id);
		response.sendRedirect("bookmarklist");

	}
	

}
