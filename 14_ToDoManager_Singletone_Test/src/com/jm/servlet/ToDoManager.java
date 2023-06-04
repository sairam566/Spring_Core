package com.jm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.singleton.pattern.DateConvertor;

@WebServlet("/ToDoManager")
public class ToDoManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ToDoManager() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered into ToDoManager");
		DateConvertor convertor = DateConvertor.getInstance();
		response.getWriter().append("ToDoManager DateConvertor : "+convertor.hashCode());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
