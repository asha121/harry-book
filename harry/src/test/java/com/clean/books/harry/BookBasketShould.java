package com.clean.books.harry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {

	@Test
	public void return_single_book_price() {
		double actual = new BookBasket().getPrice(1);
		double expected = 8;
		double delta = actual - expected;
		assertEquals(expected, actual, delta);
	}

	@Test
	public void return_two_different_title_book_price() {
		double actual = new BookBasket().getPrice(2);
		double expected = 15.2;
		double delta = actual - expected;
		assertEquals(expected, actual, delta);
	}
}
