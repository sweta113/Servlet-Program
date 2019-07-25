package org.jfs.firstApp;

import java.io.*;

import javax.servlet.*;

public class FirstServlet extends GenericServlet{


	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException 
	{
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		PrintWriter out=resp.getWriter();
		out.print("<html> <body bgcolor='yellow'>"+"<h1> My name is "+name+ " and I am from "+place+"</h1>"
				+ "</body></html>");
		out.flush();
		out.close();
		
		
      		
	}
	

}
