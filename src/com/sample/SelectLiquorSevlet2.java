package com.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sample.model.LiquorType;

/**
 * Servlet implementation class SelectLiquorSevlet
 */
@WebServlet(urlPatterns = "/SelectLiquor2")
public class SelectLiquorSevlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SelectLiquorSevlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(req.getHeaderNames());
		
		// TODO Auto-generated method stub
		
		response.setIntHeader("Refresh", 5);
		
		response.setContentType("text/html");
		
		Calendar calendar = new GregorianCalendar();
		
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		
		String am_pm;
		if (calendar.get(Calendar.AM_PM) == 0) 
			am_pm = "AM";
		else 
			am_pm = "PM";
		
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;
		
		PrintWriter out = response.getWriter();
		String title = "Auto Refresh Header Setting";
		
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0" + 
		"transititional//en\">\n";
		
		out.println(docType + 
				"<html>\n" +
		         "<head><title>" + title + "</title></head>\n"+
		         "<body bgcolor = \"#f0f0f0\">\n" +
		         "<h1 align = \"center\">" + title + "</h1>\n" +
		         "<p>Current Time is: " + CT + "</p>\n"
		         );
	}
}
