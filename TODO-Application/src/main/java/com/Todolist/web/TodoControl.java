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


public class TodoControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String todo=request.getParameter("todoInput");
		Dao d = new Dao();
		System.out.println("The control is forwarded to the doa ");
		List<DataModel> data = d.getData(todo);
		System.out.println("From Controller the model is " + data);
		request.setAttribute("data", data);
		System.out.println("The control is forwarded to the view");
		RequestDispatcher rd = request.getRequestDispatcher("ShowData.jsp");
		rd.forward(request, response);
		
	}
	
	
}
