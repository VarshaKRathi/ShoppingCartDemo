/**
 * The Shopping Cart program mainly to save the final state of cart
 * and other operations like 
 */
package com.code.bind;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private ArrayList<ItemDetails> cart;
	private List<Integer> itemCategory;
	double totalPrice;
	double sum;
	double finalPrice;
	int finalPriceLimit = 50;
	ItemDetails item = new ItemDetails();
	int totalRating = 0;

	public ShoppingCart() {
		cart = new ArrayList<ItemDetails>();
		totalPrice = 0.00;
	}

	public boolean addToCart(ItemDetails item) {
		cart.add(item);
		return true;
	}

	public void emptyCart() {
		cart.clear();
	}

	public double getItemTotal(double totalPrice) {
		finalPrice += totalPrice;
		return finalPrice;
	}

	public double getTotalPrice() {
		// how to get the sum of the prices?
		return sum;
	}

	public int getTotalNumber() {
		return cart.size();
	}

	@Override
	public String toString() {
		return "" + cart + "";
	}

	public String Sample() {
		return "sample";
	}

	/**
	 * @return the itemCategory
	 */
	public List<Integer> getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(List<Integer> itemList) {
		// TODO Auto-generated method stub

	}

	/*
	 * Logic to calculate total price
	 */

	public double calculateTotalPrice(List<Object> selectedChoice, String itemSelectedItemName) {
		double totalPrice = 0;
		for (int i = 0; i < 1; i++) {
			int firstIndex = selectedChoice.indexOf(itemSelectedItemName);
			int Price = (Integer) selectedChoice.get(firstIndex + 1);
			int shippingCost = (Integer) selectedChoice.get(firstIndex + 2);
			item.setShippingCost(shippingCost);
			totalPrice = Price * 1 + shippingCost;

		}
		return totalPrice;

	}

	/*
	 * Logic to calculate total Rating
	 */

	public int calculateTotalRating(List<Object> selectedMap, String itemSelectedItemName) {

		for (int i = 0; i < 1; i++) {
			int firstIndex = selectedMap.indexOf(itemSelectedItemName);
			int Rating = (Integer) selectedMap.get(firstIndex + 3);
			totalRating += Rating;

		}
		return totalRating;

	}

}
