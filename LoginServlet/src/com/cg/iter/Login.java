package com.cg.iter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		PrintWriter out=res.getWriter();
		String username=req.getParameter("uname");
		String password=req.getParameter("pass");
		if (username.equals("Prabhu") && password.equals("1234"))
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Success</h1>");
			out.println("</body>");
			out.println("</html>");
		}
		else
		{
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Failure</h1>");
			out.println("</body>");
			out.println("</html>");
		}
	}
}
