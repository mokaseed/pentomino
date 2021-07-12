package servlet;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.CartLogic;
import model.GetProductItemListLogic;
import model.ProductItem;


@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		商品情報をデータベースから取得してセッションスコープへ保存
		GetProductItemListLogic getProductItemListLogic = new GetProductItemListLogic();
		List<ProductItem> productItemList = getProductItemListLogic.execute();
		
		HttpSession session = request.getSession();
		session.setAttribute("productItemList", productItemList);
		
//		商品選択画面へフォワードß
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/itemList.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		商品選択画面のチェックボックス情報と、商品一覧情報を取得してリクエストスコープへ保存
		String[] id = request.getParameterValues("buyItemId");
		int[] buyItemId = Stream.of(id).mapToInt(Integer::parseInt).toArray();
		HttpSession session = request.getSession();
		List<ProductItem> productItem = (List<ProductItem>)session.getAttribute("productItemList");
		CartLogic cartLogic = new CartLogic();
		List<ProductItem> buyItemList = cartLogic.execute(buyItemId, productItem);
		request.setAttribute("buyItemList", buyItemList);
		
//		チェックボックス一覧が正しく出力できているかのテスト
//		for(ProductItem str : buyItemList) {
//			System.out.println(str);
//		}
		
//		カート確認画面へフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/cart.jsp");
		dispatcher.forward(request, response);
	}

}
