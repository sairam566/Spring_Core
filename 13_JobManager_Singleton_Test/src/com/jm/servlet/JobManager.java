package com.jm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.singleton.pattern.DateConvertor;

@WebServlet("/JobManager")
public class JobManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JobManager() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		DateConvertor convertor = DateConvertor.getInstance();
		System.out.println("Entered into Jobmanager");
		response.getWriter().append("JobManager DateConvertor : "+convertor.hashCode());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
