package com.testing.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.testing.web.dao.DataDao;
import com.testing.web.model.Data;

public class GetDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int id=Integer.parseInt(request.getParameter("Id"));
		DataDao dao = new DataDao();
		Data d1=dao.getData(id);
		
		request.setAttribute("data", d1);
		RequestDispatcher rd=request.getRequestDispatcher("showData.jsp");
		rd.forward(request, response);
		
		
	}


}
