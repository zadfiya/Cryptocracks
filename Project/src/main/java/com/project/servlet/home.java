package com.project.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.project.dao.Dao;
import com.project.model.Coin;

/**
 * Servlet implementation class home
 */
@WebServlet("/")
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Dao coinDao;
	public void init() {
		coinDao = new Dao();
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
		System.out.println(action+" 33333");
		try {
			switch (action) {
			case "/new":
				listCoins(request, response);
				//showNewForm(request, response);
				break;
			case "/insert":
				System.out.println("abcd....");
				addtoBookmark(request, response);
				break;
//			case "/delete":
//				deleteUser(request, response);
//				break;
//			case "/edit":
//				showEditForm(request, response);
//				break;
//			case "/update":
//				updateUser(request, response);
//				break;
			default:
				listCoins(request, response);
				break;
			}
		}catch(SQLException e)
		{
			throw new ServletException(e);
		}
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
		System.out.println(listCoins);
		request.setAttribute("listCoins", listCoins);
		RequestDispatcher dispatcher = request.getRequestDispatcher("coin.jsp");
		dispatcher.forward(request, response);
	}
	
	private void addtoBookmark(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.print("add to bookmark");
		RequestDispatcher dispatcher = request.getRequestDispatcher("bookmarked");
		int id = Integer.parseInt(request.getParameter("coinid"));
		request.setAttribute("user", id);
		dispatcher.forward(request, response);
	}
	

}
