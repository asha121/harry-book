package com.clean.books.harry;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BookBasketShould {

	@Test
	public void return_single_book_price() {
		List<Book> bookList =  new ArrayList<Book>();
		bookList.add(new Book("Harry 1", 1));
		double actual = new BookBasket(bookList).totalAmount();
		double expected = 8;
		double delta = 0;
		assertEquals(expected, actual, delta);
	}

	@Test
	public void return_two_different_title_book_price() {
		List<Book> bookList =  new ArrayList<Book>();
		bookList.add(new Book("Harry 1", 2));
		double actual = new BookBasket(bookList).totalAmount();
		double expected = 15.2;
		double delta = 0;
		assertEquals(expected, actual, delta);
	}

	@Test
	public void return_three_different_title_book_price() {
		List<Book> bookList =  new ArrayList<Book>();
		bookList.add(new Book("Harry 1", 3));
		double actual = new BookBasket(bookList).totalAmount();
		double expected = 8.0 * 0.90 * 3;
		double delta = 0;
		assertEquals(expected, actual, delta);
	}

	@Test
	public void return_four_different_title_book_price() {
		List<Book> bookList =  new ArrayList<Book>();
		bookList.add(new Book("Harry 1", 4));
		double actual = new BookBasket(bookList).totalAmount();
		double expected = 8.0 * 0.80 * 4;
		double delta = 0;
		assertEquals(expected, actual, delta);
	}

	@Test
	public void return_five_different_title_book_price() {
		List<Book> bookList =  new ArrayList<Book>();
		bookList.add(new Book("Harry 1", 5));
		double actual = new BookBasket(bookList).totalAmount();
		double expected = 8.0 * 0.75 * 5;
		double delta = 0;
		assertEquals(expected, actual, delta);
	}
}
