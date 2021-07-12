//商品一覧でチェックボックスにチェックを入れた商品をリスト化するモデル

package model;

import java.util.ArrayList;
import java.util.List;

public class CartLogic {
	public List<ProductItem> execute(int[] buyItemId, List<ProductItem> productItem){
		List<ProductItem> buyItemList = new ArrayList<>();
		for (int i : buyItemId) {
		ProductItem buyItem = productItem.get(i - 1);
		buyItemList.add(buyItem);
		}
		return buyItemList;
	}

}
