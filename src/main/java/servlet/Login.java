//ログイン処理を行うサーブレット

package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		User user = new User(name, password);
		
		LoginLogic LoginLogic = new LoginLogic();
		
		if(LoginLogic.execute(user)) {
//			パスワードが正しい場合
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			response.sendRedirect("/pentomino/Main");
		} else {
//			パスワードが正しくない場合
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/loginFailed.jsp");
			dispatcher.forward(request, response);
		}

	}
}
