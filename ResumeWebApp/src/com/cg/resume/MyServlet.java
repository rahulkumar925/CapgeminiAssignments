package com.cg.resume;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//System.out.println("Hello Servlet");
		//PrintWriter out = response.getWriter();
		//String name= request.getParameter("firstName");
		//String lastname = request.getParameter("lastName");
		//out.print("<h1>Hello "+name+" "+lastname+" </h1>");
		
		Person p = new Person(request.getParameter("firstName"),request.getParameter("lastName"),request.getParameter("gender"),request.getParameter("hq"),request.getParameter("dob"),request.getParameterValues("hobbies"),request.getParameter("address"),request.getParameterValues("skills"),request.getParameter("email"),request.getParameter("phone"),request.getParameter("summary"));
		request.setAttribute("PersonObject",p);
		RequestDispatcher rd = request.getRequestDispatcher("ResumeShow.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
