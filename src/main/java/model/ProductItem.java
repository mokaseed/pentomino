//商品データの情報を持つJavaBeans

package model;

import java.io.Serializable;

public class ProductItem implements Serializable {
	private int itemId;
	private String itemName;
	private int price;
	
	public ProductItem() {}
	public ProductItem(int itemId, String itemName, int price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public int getPrice() {
		return price;
	}
	
}
