package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.RegistrationTable;
import com.dao.RegistrationTableDao;
import com.dao.impl.RegistrationTableDaoImpl;;

/**
 * Servlet implementation class Registeruser
 */
@WebServlet("/registerme")
public class Registeruser extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int UserId=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registeruser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String FullName=request.getParameter("FullName");
		String EmailId=request.getParameter("EmailId");
		String Password=request.getParameter("Password");
		String RetypePassword=request.getParameter("RetypePassword");
		
		
		
		if(RetypePassword.equals(Password))
		{
			UserId++;
			int UserID=UserId;
			PrintWriter writer=response.getWriter();
			writer.println("<html>");
			writer.println("<body>");
			writer.print(UserID);
		RegistrationTable register=new RegistrationTable(UserID,FullName,EmailId,Password);
		writer.println("Constructor Called");
		RegistrationTableDao dao= new RegistrationTableDaoImpl();
		int users=dao.addUser(register);
		writer.print(users);
	//	PrintWriter writer=response.getWriter();
		//writer.println("<html>");
		//writer.println("<body>");
		writer.println(FullName);
		writer.println(EmailId);
		writer.println(UserID);
			if(users>0)
				{
					writer.println("User Added Successfully");
				}
			else
				{
					String message="Sorry cannot add book Please RETRY!";
					request.setAttribute("mymessage", message);
					RequestDispatcher dispatcher=request.getRequestDispatcher("adduser.jsp");
					dispatcher.forward(request, response);
				}
			writer.println("</body>");
			writer.println("</html>");
		}
}	

}


