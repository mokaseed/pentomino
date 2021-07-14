//商品データの情報を持つJavaBeans

package model;

import java.io.Serializable;

public class ProductItem implements Serializable {
	private int itemId;
	private String itemName;
	private int price;
	private int quantity;
	
	public ProductItem() {}
	public ProductItem(int itemId, String itemName, int price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
	}
	public ProductItem(int itemId, String itemName, int price, int quantity) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	
}
