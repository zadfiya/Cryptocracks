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
			case "/new":
				listCoins(request, response);
				//showNewForm(request, response);
				break;
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
				System.out.println("edit.....");
				showEditForm(request, response);
				break;
			case "/update":
				updateCoin(request,response);
				break;
			case "/bookmarklist":
				System.out.println("list..... bookmarklist");
				listBookmarkedCoins(request,response);
				break;
			default:
				listCoins(request, response);
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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String action = request.getServletPath();
		System.out.println(action+" action");
		try {
			switch (action) {
			case "/new":
				listBookmarkedCoins(request,response);
				//showNewForm(request, response);
				break;
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
				System.out.println("list..... bookmarklist");
				listBookmarkedCoins(request,response);
				break;
			default:
				System.out.println("list..... default");
				listCoins(request, response);
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
	
	private void listCoins(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Coin> listCoins = coinDao.selectALLCoins();
		System.out.println(listCoins);
		request.setAttribute("listCoins", listCoins);
		RequestDispatcher dispatcher = request.getRequestDispatcher("coin.jsp");
		dispatcher.forward(request, response);
	}
	
	private void addtoBookmark(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//RequestDispatcher dispatcher = request.getRequestDispatcher("bookmarked");
		int id = Integer.parseInt(request.getParameter("coinid"));
		//request.setAttribute("user", id);
		response.sendRedirect("boommarked?coindid="+id);
		//dispatcher.forward(request, response);
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
		//String insertDate = "12-11-2022";
		
		String insertDate = (String) request.getAttribute("insertDate");
		Bookmarked bookmarked = new Bookmarked(coinid,purchasedPrice,quantity,purchasedDate,insertDate);
		bookmarked.setName(name);
		bookmarkedDao.insertCoin(bookmarked);
		response.sendRedirect("list");
	}
	
//	private void insertCoin(HttpServletRequest request, HttpServletResponse response) 
//			throws SQLException, IOException {
//		
//		System.out.println(request.getAttribute("name") + "nnnnnnnnnnnnn");
//		int coinid = Integer.parseInt((String) request.getParameter("coinid"));
//		System.out.println(  request.getAttribute("pPrice"));
//		double purchasedPrice = Double.parseDouble((String) request.getAttribute("pPrice"));
//		double quantity = Double.parseDouble((String) request.getAttribute("quantity"));
//		String purchasedDate = (String) request.getAttribute("pDate");
//		String insertDate = "12-11-2022";
//		
//		//String insertDate = (String) request.getAttribute("insertDate");
//		Bookmarked bookmarked = new Bookmarked(coinid,purchasedPrice,quantity,purchasedDate,insertDate);
//		bookmarkedDao.insertCoin(bookmarked);
//		response.sendRedirect("list");
//	}

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
