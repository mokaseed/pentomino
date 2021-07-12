//商品データをデータベースから取得するDAO

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ProductItem;


public class ProductItemDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/pentomino";
	private final String DB_USER = "sa";
	private final String DB_PASS = "";
	
	public List<ProductItem> findALL(){
		List<ProductItem> productItemList = new ArrayList<>();
		
		
//		データベース接続
		try(Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {
			String sql = "SELECT ITEM_ID, ITEM_NAME, PRICE FROM PRODUCT_ITEM ORDER BY ITEM_ID";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			
			ResultSet rs = pStmt.executeQuery();
			
			while (rs.next()) {
				int itemId = rs.getInt("ITEM_ID");
				String itemName = rs.getString("ITEM_NAME");
				int price = rs.getInt("PRICE");
				ProductItem productItem = new ProductItem(itemId, itemName, price);
				productItemList.add(productItem);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			System.out.println(e);
			return null;
		}
		return productItemList;
	}

}
