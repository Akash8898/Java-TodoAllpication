package com.testing;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost (HttpServletRequest request,HttpServletResponse response) throws IOException 
	{
		
		int i=Integer.parseInt(request.getParameter("num1"));
		int j=Integer.parseInt(request.getParameter("num2"));
		int k=i+j;
		
		System.out.println("The Result is "+k); 
		PrintWriter out = response.getWriter();
//		out.println("<html><body bgcolor='cyan'></body></html>");
//		out.println("The Result is "+k);
//		out.println("</body></html>");
		out.println("The result is " + k);
	}
}
