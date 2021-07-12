//商品情報をデータベースから取得するモデル

package model;

import java.util.List;

import dao.ProductItemDAO;

public class GetProductItemListLogic {
	public List<ProductItem> execute() {
		ProductItemDAO dao = new ProductItemDAO();
		List<ProductItem> productItemList = dao.findALL();
		return productItemList;
	}

}
