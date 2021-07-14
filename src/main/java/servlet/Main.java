package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
import model.TotalAmountLogic;



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
//		String[] id = request.getParameterValues("buyItemId");
//		int[] buyItemId = Stream.of(id).mapToInt(Integer::parseInt).toArray();
//		HttpSession session = request.getSession();
//		List<ProductItem> productItem = (List<ProductItem>)session.getAttribute("productItemList");
//		CartLogic cartLogic = new CartLogic();
//		List<ProductItem> buyItemList = cartLogic.execute(buyItemId, productItem);
//		request.setAttribute("buyItemList", buyItemList);
		
//		チェックボックス一覧が正しく出力できているかのテスト
//		for(ProductItem str : buyItemList) {
//			System.out.println(str);
//		}
		
//		7/14 商品一覧画面のチェックボックスを無くし、数量入力へ変更
		
//		商品ID毎の数量をリクエストパラメータから取得し、購入商品リストを作成
		HttpSession session = request.getSession();
		List<ProductItem> productItemList = (List<ProductItem>)session.getAttribute("productItemList");
		ArrayList<String> quantityList = new ArrayList<String>();
		
		for(ProductItem productItem : productItemList) {
			String i = request.getParameter(String.valueOf(productItem.getItemId()));
			if(i == "" || i == null) {
				quantityList.add("0");
			} else {
				quantityList.add(i);
			}
		}
		
		CartLogic cartLogic = new CartLogic();
		List<ProductItem> buyItemList = cartLogic.execute(productItemList, quantityList);
		request.setAttribute("buyItemList", buyItemList);
		
//		合計金額を算出
		TotalAmountLogic totalAmountLogic = new TotalAmountLogic();
		Integer totalAmount = totalAmountLogic.execute(buyItemList);
		request.setAttribute("totalAmount", totalAmount);
		
//		カート確認画面へフォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/cart.jsp");
		dispatcher.forward(request, response);
	}

}
