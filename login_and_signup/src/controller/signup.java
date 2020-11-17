package controller;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Business_logic.Registration_Validation;


@WebServlet("/signup")
public class signup extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public signup() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
	    rd.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	  String email=request.getParameter("email");
	  String password=request.getParameter("password");
	  String confirmpassword=request.getParameter("confirmPassword");
	  LocalDateTime date=LocalDateTime.now();
	  Registration_Validation rv=new Registration_Validation();
	  if(rv.checkuserdetails(email,password,confirmpassword))
	  {
		 request.setAttribute("message","Registration succesfull!!");
		 RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
		 rd.forward(request,response);
	  }
	  else
	  {
		  request.setAttribute("message","Registration unsuccesfull!!");
		  RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/signupview.jsp");
		  rd.forward(request,response);
	  }
		
		
	}

}
