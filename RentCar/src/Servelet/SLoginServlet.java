package Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaClass.SystmeU;
import com.javaUtil.DB.StystemUDBUtil;


@WebServlet("/SLoginServlet")
public class SLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("uid");
		String password = request.getParameter("pass");
		
		try {
		List<SystmeU> stDetails= StystemUDBUtil.validate(username, password);
		request.setAttribute("stDetails" ,stDetails);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis =request.getRequestDispatcher("SystemU.jsp");
		dis.forward(request, response);
		
	
	}

}
