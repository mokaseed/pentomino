package model;

import java.util.List;

public class TotalAmountLogic {
	int totalAmount = 0;
	public int execute(List<ProductItem> buyItemList){
		for(ProductItem productItem : buyItemList) {
			int price = productItem.getPrice();
			int quantity = productItem.getQuantity();
			int subtotal = price * quantity;
			totalAmount += subtotal;
		}
	return totalAmount;
	}
}
