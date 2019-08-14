/**
 * The ItemDetails program is a model class with Item characteristics
 */
package com.code.bind;

public class ItemDetails {
	private String itemName;
	private double itemPrice;
	private double shippingCost;
	private int itemTotalRating;
	private double cartFinalValue;
	private int itemSelectedCategory;

	public ItemDetails(String itemName_A, double itemPrice_A, double shippingCost_A, int itemTotalRating_A) {
		itemName = itemName_A;
		itemPrice = itemPrice_A;
		shippingCost = shippingCost_A;
		setItemTotalRating(itemTotalRating_A);
	}
	
	@Override
	public String toString() {
		return   "\tItem Name=" + itemName + "\t Selected Category=" + itemSelectedCategory 
				+ "\n" ;
	}

	public ItemDetails() {

	}

	public ItemDetails(String category, Integer price, Integer shippingCost2, Integer itemRating) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	/**
	 * @return the itemPrice
	 */
	public double getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice
	 *            the itemPrice to set
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * @return the shippingCost
	 */
	public double getShippingCost() {
		return shippingCost;
	}

	/**
	 * @param shippingCost
	 *            the shippingCost to set
	 */
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}

	/**
	 * @return the itemTotalRating
	 */
	public int getItemTotalRating() {
		return itemTotalRating;
	}

	/**
	 * @param itemTotalRating the itemTotalRating to set
	 */
	public void setItemTotalRating(int itemTotalRating) {
		this.itemTotalRating = itemTotalRating;
	}

	/**
	 * @return the cartFinalValue
	 */
	public double getCartFinalValue() {
		return cartFinalValue;
	}

	/**
	 * @param cartFinalValue the cartFinalValue to set
	 */
	public void setCartFinalValue(double cartFinalValue) {
		this.cartFinalValue = cartFinalValue;
	}

	/**
	 * @return the itemSelectedCategory
	 */
	public int getItemSelectedCategory() {
		return itemSelectedCategory;
	}

	/**
	 * @param itemSelectedCategory the itemSelectedCategory to set
	 */
	public void setItemSelectedCategory(int itemSelectedCategory) {
		this.itemSelectedCategory = itemSelectedCategory;
	}

}
