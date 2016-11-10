package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Firstervlet
 */
@WebServlet("/Firstervlet")
public class Firstervlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Firstervlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		session.setAttribute("fname", request.getParameter("name"));
		response.setContentType("text/html");
		String docType =
			      "<!doctype html public \"-//w3c//dtd html 4.0 " +
			      "transitional//en\">\n";
		PrintWriter out = response.getWriter();
		out.print("Frist Name " + request.getParameter("name"));
		out.print("<br>");
		out.print(docType+"<html>");
		out.print("<head></head>");
		out.print("<body bgcolor=\"#f0f0f0\">");
		out.print("<form action=\"SecondServlet\">");
		out.print("Last Name ");
		out.print("<input name=\"lname\" type=\"text\"></input>");
		out.print("<input type=\"submit\"></input>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
		
		

	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
