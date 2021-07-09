package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginLogic;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String password = request.getParameter("password");
		String user = request.getParameter("user");
		
		String nextJsp;
		LoginLogic LoginLogic = new LoginLogic();
		boolean isLogin = LoginLogic.execute(password);
		
		if(isLogin) {
//			パスワードが正しい場合
			request.setAttribute("user", user);
			nextJsp = "/WEB-INF/itemList.jsp";
		} else {
//			パスワードが正しくない場合
			nextJsp = "WEB-INF/loginFailed.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(nextJsp);
		dispatcher.forward(request, response);
	}
}
