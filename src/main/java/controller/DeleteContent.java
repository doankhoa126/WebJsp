package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.DAOContent;

/**
 * Servlet implementation class DeleteContent
 */
@WebServlet("/DeleteContent")
public class DeleteContent extends HttpServlet {

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		DAOContent dao= new DAOContent();
		dao.deleteContent(id);
		response.sendRedirect("ViewContent");
	}

}
