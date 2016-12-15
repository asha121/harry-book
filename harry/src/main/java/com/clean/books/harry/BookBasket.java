package com.clean.books.harry;

public class BookBasket {

	public double getPrice(int books) {
		if (books == 1) {
			return 8.0;
		}
		return 8.0 * 0.95 * books;

	}

}
