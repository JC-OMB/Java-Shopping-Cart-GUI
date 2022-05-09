/**
 * A class representing a shopping cart of items. Upon creation, constructor initializes the name
 * and price of a product accounting for bulk prices/quantities as well.
 * Constructors throw IllegalArgumentExceptions if any prices/quantities are less than zero.
 * The Item shopping cart keeps track of products as they are added/removed from the cart.
 * Call to priceFor method return a given price in the form of a string for a product.
 * Call to toString method will print out the product name, price, and quantity
 * including its bulk price and bulk quantity as well.
 * Call to getName method will return the name of the product.
 */

import java.text.*;

public class Item {

	private String name;
	private double price;
	private int bulkQuantity;
	private double bulkPrice;
	private String available;

	/**
	 * initializes a product and price equal to the input of the user's
	 * initialization.
	 *
	 * @param name  name given to product.
	 * @param price price of specified product.
	 */
	public Item(String name, double price, String available) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative!");
		} else {
			this.name = name;
			this.price = price;
			this.available = available;
		}
	}

	/**
	 * initializes the product and price, accounting for bulk quantity and bulk
	 * price as well. These values are equal to the input of the user's
	 * initialization.
	 *
	 * @param name         name given to product.
	 * @param price        price of specified product.
	 * @param bulkQuantity bulk quantity of product.
	 * @param bulkPrice    bulk price of the bulk quantity.
	 */
	public Item(String name, double price, int bulkQuantity, double bulkPrice) {
		if (price < 0 || bulkQuantity < 0 || bulkPrice < 0) {
			throw new IllegalArgumentException("Prices/quantities cannot be negative!");
		} else {
			this.name = name;
			this.price = price;
			this.bulkQuantity = bulkQuantity;
			this.bulkPrice = bulkPrice;
		}
	}

	/**
	 * returns the price for a product given its quantity.
	 * accounts for bulk products and products who's quantity
	 * is greater than the amount of bulk products on sale 
	 * (for example, if you buy 13 of a bulk item and the 
	 * deal is only valid for 10 of them).
	 *
	 * @param quantity the quantity of given product.
	 * @return price for product.
	 */
	public double priceFor(int quantity) {
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be negative!");
		}

		else if (quantity == bulkQuantity) {
			return bulkPrice;
		} else if (quantity < bulkQuantity || bulkQuantity == 0) {
			return quantity * price;
		}

		else {
			int quantGreater = quantity % bulkQuantity;
			double result = (quantGreater * price) + (bulkPrice * quantity / bulkQuantity);
			return result;
		}

	}

	/**
	 * Neatly prints out the product and price. Accounts for bulk quantity and bulk
	 * price as well.
	 */
	@Override
	public String toString() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String text = nf.format(price);
		if (bulkPrice > 0) {
			return name + ", " + text + " (" + bulkQuantity + " for $" + bulkPrice + ")";
		} else {
			return name + " //  Price: " + text + "  //  Is it available:" + available;
		}
	}

	/**
	 * returns the name of the given product.
	 *
	 * @return product.
	 */
	public String getName() {
		return name;
	}
}
