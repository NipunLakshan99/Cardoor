package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaClass.admin;
import com.javaUtil.DB.AdminDao;


@WebServlet("/ALoginServlet")
public class ALoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List<admin> stDetails= AdminDao.validate(username, password);
		request.setAttribute("stDetails" ,stDetails);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis =request.getRequestDispatcher("index.html");
		dis.forward(request, response);
		
	
	}

}
