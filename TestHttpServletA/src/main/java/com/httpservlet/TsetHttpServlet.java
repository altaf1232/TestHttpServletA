package com.httpservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TsetHttpServlet extends HttpServlet
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException 
   {
	 res.setContentType("text/html");
	 PrintWriter out=res.getWriter();
	 out.println("hi am there ");
	 out.close();
	 
   }
}
