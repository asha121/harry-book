package com.clean.books.harry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {

	@Test
	public void return_single_book_price() {
		double actual = new BookBasket().getPrice(1);
		double expected = 8;
		double delta = actual - expected;
		assertEquals(8.0, actual, delta);
	}

	@Test
	public void return_two_different_title_book_price() {
		double actual = new BookBasket().getPrice(2);
		double expected = 8;
		double delta = actual - expected;
		assertEquals(15.2,actual,delta);
	}

}
