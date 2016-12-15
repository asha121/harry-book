package com.clean.books.harry;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BookBasketShould {

	@Test
	public void return_single_book_price() {
		assertEquals(8, new BookBasket().getPrice());
	}

	@Test
	public void return_two_different_title_book_price() {
		BookBasket basket = new BookBasket();
		assertEquals(16 * 0.95, basket.getPrice());
	}
}
