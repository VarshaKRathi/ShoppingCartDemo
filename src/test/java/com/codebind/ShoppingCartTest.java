package com.codebind;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.code.bind.ItemDetails;
import com.code.bind.ShoppingCart;

/**
 * @author varsha.k.rathi
 *
 */

public class ShoppingCartTest {

	@Test
	public void calculateTotalRatingTest() {
		ShoppingCart shoppingcart = new ShoppingCart();
		List<Object> selectedMapMock = Arrays.asList("Item1", 16, 5, 3, "Item2", 18, 3, 4);		
		int actualValue=shoppingcart.calculateTotalRating(selectedMapMock,"Item1");
		assertEquals(3,actualValue);
		
	}
	
	
	@Test
	public void calculateTotalPriceTest() {
		ShoppingCart shoppingcart = new ShoppingCart();
		List<Object> selectedMapMock = Arrays.asList("Item1", 16, 5, 3, "Item2", 18, 3, 4);		
		double actualValue=shoppingcart.calculateTotalPrice(selectedMapMock,"Item1");
		double expectedValue = 21;
		assertEquals(expectedValue, actualValue, actualValue);
		
	}


}
