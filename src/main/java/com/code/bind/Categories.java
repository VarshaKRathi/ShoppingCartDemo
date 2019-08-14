/**
 * The Categories program implements the logic to produce data source using collection and random list
 */
package com.code.bind;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Categories {

	public static Categories categories = null;

	private static Map<Integer, List<String>> subCategories = null;

	/*
	 * Populating Item category and names in HashMap using Constructor
	 */
	Categories() {
		subCategories = new HashMap<Integer, List<String>>();
		subCategories.put(1, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(2, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(3, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(4, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(5, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(6, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(7, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(8, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(9, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(10, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(11, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(12, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(13, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(14, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(15, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(16, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(17, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(18, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(19, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
		subCategories.put(20, Arrays.asList("Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8",
				"Item9", "Item10"));
	}

	public static Categories getInstance() {
		if (categories == null) {
			categories = new Categories();
		}
		return categories;
	}

	/*
	 * Returning subcategories as a map for param category
	 */
	public static Map<Integer, List<String>> getSubCategoriesMap(Integer category) {
		return subCategories;
	}

	/*
	 * Method to Generate Random price list
	 */
	public Integer givenList_shouldReturnRandomPrice() {
		Random rand = new Random();
		Integer randomElement = null;
		List<Integer> givenList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

		int numberOfElements = 1;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomElement = givenList.get(randomIndex);
		}
		return randomElement;
	}

	/*
	 * Method to Generate Random Shipping Cost list
	 */
	public Integer givenList_shouldReturnRandomShippingCost() {
		Random rand = new Random();
		Integer randomElement = null;
		List<Integer> givenList = Arrays.asList(2, 3, 4, 5);

		int numberOfElements = 1;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomElement = givenList.get(randomIndex);
		}
		return randomElement;
	}

	/*
	 * Method to Generate Random Rating list
	 */
	public Integer givenList_shouldReturnRandomRating() {
		Random rand = new Random();
		Integer randomElement = null;
		List<Integer> givenList = Arrays.asList(1, 2, 3, 4, 5);

		int numberOfElements = 1;

		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomElement = givenList.get(randomIndex);
		}
		return randomElement;
	}
}