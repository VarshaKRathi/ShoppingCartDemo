/**
 * The Shopping program implements an application that simply displays menu options and enables all operations of Shopping Cart
 */
package com.code.bind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Shopping {
	public static void main(String[] args) throws Exception {

		ShoppingCart cart = new ShoppingCart();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Hello! Please choose an option from the menu.\n");
		int choice = 5;
		String answer = "";
		ItemDetails item = new ItemDetails();
		double totalPrice =0;

		Categories categories = new Categories();

		while (choice > 0) {
			displayMenu();
			choice = scanner.nextInt();
			
			List<Map<Integer, List<Object>>> finalList = new ArrayList<Map<Integer, List<Object>>>();
			Map<Integer, List<Object>> itemByChoice = new HashMap<Integer, List<Object>>();

			List<Integer> itemList = new ArrayList<Integer>();
			List<Object> group = new ArrayList<Object>();
			
			switch (choice) {
			case 1:
				Integer category_1 = 1;
				Map<Integer, List<String>> categoriesMap1 = categories.getSubCategoriesMap(category_1);

				Set<Integer> setOfKeySet1 = categoriesMap1.keySet();

				// for-each loop
				for (Integer key : setOfKeySet1) {

					itemByChoice = new HashMap<Integer, List<Object>>();
					group = new ArrayList<Object>();
					System.out.println("\nCategory ID: " + key + "\nList of Top Items of Category" + key + ":" + "\n");
					System.out
							.println("\t" + "Name:" + "\t" + "Price:" + "\t" + "ShippingCost:" + "\t" + "ItemRating:");

					for (String category : categoriesMap1.get(key)) {

						Integer price = categories.givenList_shouldReturnRandomPrice();
						Integer shippingCost = categories.givenList_shouldReturnRandomShippingCost();
						Integer itemRating = categories.givenList_shouldReturnRandomRating();
						System.out.println(
								"\t" + category + "\t" + "$" + price + "\t" + "$" + shippingCost + "\t\t" + itemRating);
						group.add(category);
						group.add(price);
						group.add(shippingCost);
						group.add(itemRating);

					}

					itemByChoice.put(key, group);
					finalList.add(itemByChoice);

				}

			case 2:

				double cartValue = 0;
				System.out
						.print("\nWould you like to add Item to your cart?\n" + "Type \"Y\" for Yes or \"N\" for No.");

				String keepShopping = scanner.next();

				do {

					System.out.println(
							"\nPlease Select Category ID: \n***Input any numbers for Category ID from 1 to 20- Example:1,2,3,4 etc.");
					Integer itemSelectedCategory = scanner.nextInt();
					if (!itemList.contains(itemSelectedCategory)) {
						itemList.add(itemSelectedCategory);
						cart.setItemCategory(itemList);
					} else {
						do {
							System.out.println("\nPlease Select Another Category ID since Category : " + " "
									+ itemSelectedCategory + " "
									+ "You already added to cart. \n\t***You can only choose 1 Item from each category\n\t***Input any numbers for Category ID from 1 to 20- Example:1,2,3,4 etc.");
							itemSelectedCategory = scanner.nextInt();
						} while (itemList.contains(itemSelectedCategory));
					}
					itemList.add(itemSelectedCategory);
					cart.setItemCategory(itemList);
					System.out.println(
							"Please Provide Item Name : \n***Input any Name in same format (*CaseSensitive*) as Item1,Item2,Item3 till Item10");
					answer = scanner.next();
					String itemSelectedItemName = answer;

					Map<Integer, List<Object>> selectedChoice = finalList.get(itemSelectedCategory - 1);
					List<Object> selectedMap = selectedChoice.get(itemSelectedCategory);

					// set file input to item vars
					item = new ItemDetails();
					totalPrice = cart.calculateTotalPrice(selectedMap, itemSelectedItemName);
					int itemRatingTotal = cart.calculateTotalRating(selectedMap, itemSelectedItemName);

					// Set Selected Item Values in ItemDetails
					item.setItemName(itemSelectedItemName);
					item.setItemPrice(totalPrice);
					item.setItemTotalRating(itemRatingTotal);
					item.setItemSelectedCategory(itemSelectedCategory);
					if (totalPrice > 0) {
						System.out.print("\n");
						System.out.print("---------------------------\n");
						System.out.print("***Item Total Cost with Shipping Price:  " + " " + totalPrice);
						cartValue = cart.getItemTotal(totalPrice);
						item.setCartFinalValue(cartValue);
						System.out.println("\n***Current Cart Value:  " + " " + cartValue);
						System.out.print("---------------------------\n");
					}

					if (cart.addToCart(item)) {
						System.out.print("\n");
						System.out.print("---------------------------\n");
						System.out.print("- Item added to your cart -\n");
						System.out.print("---------------------------\n");

						System.out.print("Would like to continue Shopping?\n");
						keepShopping = scanner.next();
					}
				} while (keepShopping.equalsIgnoreCase("y") && cartValue < cart.finalPriceLimit);

				if (cartValue >= cart.finalPriceLimit) {
					System.out.println("Your Cart Value reached the limit of $50" + "\nPlease pay: $" + cartValue);
				} else {
					System.out.println("Please pay: $" + cartValue);
				}

				if (keepShopping.equalsIgnoreCase("Y")) {
				} else {
					System.out.print("\n");
					System.out.print("--------------------------------------------\n");
					System.out.print("- Thanks For Shopping With Us!!...returning to main menu. -\n");
					System.out.print("--------------------------------------------\n");
					System.out.print("\n");
				}

				// input.close();
			case 3:
				String s = cart.toString();
				System.out.println("Cart=" + cart + "\n");
				break;
			case 4:
				System.out.print("\n");
				System.out.print("\n");
				System.out.print("-----------------------------------------\n");
				System.out.print("-----------------------------------------\n");
				System.out.print("You have total of " + cart.getTotalNumber() + " purchases.\n");
				System.out.print("Your total is : $" + item.getCartFinalValue() + "\n");
				System.out.print("-----------------------------------------\n");
				System.out.print("-----------------------------------------\n");
				System.out.print("\n");
				System.out.print("\n");
				break;
			case 5:
				cart.emptyCart();
				System.out.print("-----------------------------------------\n");
				System.out.println("***Cart got Cleared Successfully***");
				System.out.print("-----------------------------------------\n");
				break;
	
			case 6:
				System.out.print("\n");
				System.out.print("\n");
				System.out.println("Thank you! Come again!");
				scanner.close();
				System.exit(1);
			}
		}
	}

	public static void displayMenu() {
		System.out.println("\n*******************************************");
		System.out.println("Select an Option and enter your choice.   *");
		System.out.println("1) Display Items with Categories Available to buy.   *");
		System.out.println("2) Add items to your cart.                *");
		System.out.println("3) Display the items in your cart and the *\n" + "   running total.                         *");
		System.out.println("4) Checkout.                              *");
		System.out.println("5) Empty your cart.                       *");
		System.out.println("6) Quit                                   *");
		System.out.println("*******************************************");
		System.out.print("Enter a number (1 through 5) as your choice: ");
	}
}
