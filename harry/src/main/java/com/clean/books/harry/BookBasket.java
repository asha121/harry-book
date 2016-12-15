package com.clean.books.harry;

public class BookBasket {

	public double getPrice(int books) {
		double price;
		if (books == 1)
			price = 8.0;
		else
			price = 8.0 * 0.95 * books;

		return price;
	}

}
