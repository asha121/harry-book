package com.clean.books.harry;

public class BookBasket {

	public double getPrice(int books) {
		double price = 0;
		if (books == 1)
			price = 8.0;
		else if ((books == 2))
			price = 8.0 * 0.95 * books;
		else if ((books == 3))
			price = 8.0 * 0.90 * books;
		else if ((books == 4))
			price = 8.0 * 0.80 * books;
		else if ((books == 5))
			price = 8.0 * 0.75 * books;
		return price;
	}

}
