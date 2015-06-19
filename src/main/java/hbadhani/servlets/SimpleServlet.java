package hbadhani.servlets;


import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by hbadhani on 19/06/2015.
 */
//@WebServlet
public class SimpleServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,
	                      HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		response.setContentType("text/html");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String userAge = request.getParameter("age");
		PrintWriter writer = response.getWriter();
		writer.write("<h1>Hello, <b>" + firstName + lastName + "!<b>Your age is " + userAge +"</h1>");
		//writer.write("<h1>Hello, <b>" + user + "!<b></h1>");

	}

	protected void doGet(HttpServletRequest request,
	                     HttpServletResponse response) throws javax.servlet.ServletException, IOException {
		response.setContentType("text/html");
		String user = request.getParameter("userName");
		String userAge = request.getParameter("age");
		PrintWriter writer = response.getWriter();
		writer.write("<h1>Hello, <b>" + user + "!<b>Your age is " + userAge +"</h1>");
	}
}
