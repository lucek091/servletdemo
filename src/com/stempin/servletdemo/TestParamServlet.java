package com.stempin.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TestParamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//set content type
		response.setContentType("text/html");
		
		//get printwrite
		PrintWriter out=response.getWriter();
		
		//read configuration params from xml
		ServletContext context=getServletContext(); //inherit fro m HttpServlet		
		String maxCartSize=context.getInitParameter("max-shopping-cart-size");
		String teamName=context.getInitParameter("project-team-name");
		
		//generate HTML content on the fly
		
		out.println("<html><body>");
		
		out.println("Max cart size: " + maxCartSize);
		out.println("<br/><br/>");
		out.println("Team name: " + teamName);
		
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
