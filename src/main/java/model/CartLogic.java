//商品一覧でチェックボックスにチェックを入れた商品をリスト化するモデル

package model;

import java.util.ArrayList;
import java.util.List;

public class CartLogic {
//	public List<ProductItem> execute(int[] buyItemId, List<ProductItem> productItem){
//		List<ProductItem> buyItemList = new ArrayList<>();
//		for (int i : buyItemId) {
//		ProductItem buyItem = productItem.get(i - 1);
//		buyItemList.add(buyItem);
//		}
//		return buyItemList;
//	}
	
	public List<ProductItem> execute(List<ProductItem> productItemList, List<String> quantityList){
		List<ProductItem> buyItemList = new ArrayList<>();
		for (ProductItem productItem : productItemList) {
			int id = productItem.getItemId();
			String name = productItem.getItemName();
			int price = productItem.getPrice();
			int quantity = Integer.parseInt(quantityList.get(id - 1));
			ProductItem buyItem = new ProductItem(id, name, price,quantity);
			buyItemList.add(buyItem);
		}
	return buyItemList;
	}
}
