package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GetProductItemListLogic;
import model.ProductItem;


@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		商品情報をデータベースから取得してリクエストスコープへ保存
		GetProductItemListLogic getProductItemListLogic = new GetProductItemListLogic();
		List<ProductItem> productItemList = getProductItemListLogic.execute();
		request.setAttribute("productItemList", productItemList);
		
//		商品選択画面へフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/itemList.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
