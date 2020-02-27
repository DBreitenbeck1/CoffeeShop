package co.grandcircus.CoffeeShop.entitycust;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import co.grandcircus.CoffeeShop.entityprod.Product;

public class UserPreferences implements Serializable {
	private String favName;
	private String favType;
	private	double	favPrice;
	private Product favItem;
	private List<Product> favItems = new ArrayList<>(); 
	
	public List<Product> getFavItems() {
		return favItems;
	}
	
	public void addItem(Product p) {
		this.favItems.add(p);
	}
	
	public void setFavItems(List<Product> favItems) {
		this.favItems = favItems;
	}

	public Product getFavItem() {
		return favItem;
	}

	public void setFavItem(Product favItem) {
		this.favItem = favItem;
	}

	private static final long serialVersionUID = 1L;

	public UserPreferences() {

	}

	public String getFavName() {
		return favName;
	}

	public void setFavName(String favName) {
		this.favName = favName;
	}

	public String getFavType() {
		return favType;
	}

	public void setFavType(String favType) {
		this.favType = favType;
	}

	public double getFavPrice() {
		return favPrice;
	}

	public void setFavPrice(double favPrice) {
		this.favPrice = favPrice;
	}

	

	

}
