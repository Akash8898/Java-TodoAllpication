package com.Todolist.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Todolist.web.dao.Dao;
import com.Todolist.web.model.DataModel;

public class UpdateControl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String process = request.getParameter("btn").toString();
		String[] split = process.split("-", 1);
		Dao d =new Dao();
		List<DataModel> datamod= d.getUpdate(split[2]);
		request.setAttribute("data", datamod);
		RequestDispatcher rd = request.getRequestDispatcher("ShowData.jsp");
		rd.forward(request, response);
	}
}
