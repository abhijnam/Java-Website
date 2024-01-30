package com.abhijna;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	// we cannot use any other class name except service()
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i +j;
		
		req.setAttribute("k",k);
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		// request dispatcher and redirect
	}
}
