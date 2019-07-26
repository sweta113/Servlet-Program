package org.jfs.uiApp;

import java.io.*;

import javax.servlet.*;

public class UI extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("un");
		String password=req.getParameter("psw");
		
		PrintWriter out=resp.getWriter();
		out.print("<html> <body bgcolor='lightgreen'>"+"<h2> welcome!! "+username+" your password is "+password+"</h2>"
				+ "</body> </html>");
		out.flush();
		out.close();
		
	}
	

}
