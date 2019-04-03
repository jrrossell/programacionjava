package com.curso.java.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Servlet implementation class EjemploServlet
 */
@WebServlet({ "/patatas", "/limones" })
public class EjemploServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ApplicationContext context;
	
	
	
	@Override
	public void init() throws ServletException {
		
		ApplicationContext applicationContext = WebApplicationContextUtils
			.getRequiredWebApplicationContext(getServletContext());
		this.context = applicationContext;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EjemploServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("mensajeSingleton", context.getBean("mensajeSingleton"));
		request.setAttribute("mensajePrototype", context.getBean("mensajePrototype"));
		request.setAttribute("mensajeRequest", context.getBean("mensajeRequest"));
		request.setAttribute("mensajeSession", context.getBean("mensajeSession"));
		getServletContext().getRequestDispatcher("/WEB-INF/jsps/saludar.jsp").forward(request, response);
	}

}
