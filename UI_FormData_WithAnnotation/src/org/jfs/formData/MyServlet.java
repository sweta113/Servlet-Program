package org.jfs.formData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/jfs")
public class MyServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		PrintWriter out=resp.getWriter();
		out.print("<html> <body bgcolor='cyan'>"+"<h2> User is "+fname+ lname+"</h2>"
				+ "</body></html>");
		out.flush();
		out.close();
		
	}

}
