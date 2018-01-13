package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.LoginDAO;
import Model.*;

import java.io.*;
@WebServlet("/LoginController")
public class LoginController extends HttpServlet
{
	private static final long serialVersionUID = 1L;

    public LoginController() 
    {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
        response.setContentType("text/html;charset=UTF-8");
        
        {
         String Username=request.getParameter("uname");
           String Password=request.getParameter("passwd");
          
           Login loginobj=new Login();
           loginobj.setLogin(Username);
           loginobj.setPassword(Password);
          
          try
          {
           LoginDAO ldao=new LoginDAO();
           
           if(ldao.isValid(loginobj))
           {
               RequestDispatcher dispatch=request.getRequestDispatcher("Success.jsp");
             dispatch.forward(request,response);
           }
        else
           {
             RequestDispatcher dispatch=request.getRequestDispatcher("Failed.jsp");
             dispatch.forward(request,response);
           }
           
          }
           catch(Exception e)
           {
        	   System.out.println("Exception occured"+e);
        	   
           }
        	   
           
        }   
        
	}

        
}
        
