package com.clean.books.harry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BookBasket {
	private List<Book> books;

	public BookBasket(List<Book> books) {
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public double totalAmount() {
		double amount = 0.0;
		for (Book book : books) {
			amount = amount + getPrice(book);
		}
		return amount;
	}

	private double getPrice(Book book) {
		int bookQunatity = book.getQuantity();
		Map<Integer, Double> discountprices = new HashMap<Integer, Double>();
		discountprices.put(1, 8.0);
		discountprices.put(2, 8.0 * 0.95 * bookQunatity);
		discountprices.put(3, 8.0 * 0.90 * bookQunatity);
		discountprices.put(4, 8.0 * 0.80 * bookQunatity);
		discountprices.put(5, 8.0 * 0.75 * bookQunatity);

		return discountprices.get(book.getQuantity());
	}

}
