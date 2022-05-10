import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<ItemOrder> list = new ArrayList<>(); //ArrayList of the total items ordered in the cart.
	private double total; //represents total price of order.
	private boolean discountUsed; //boolean variable to determine if discount was used.
	private boolean replaceItem; //boolean variable to determine if item must be added or replaced.

	public ShoppingCart() {
		list.clear(); 
	}

	public void add(ItemOrder item) { //adds/modifies items to the ArrayList of items ordered.

		for (int i = 0; i < list.size(); i++) { //Checks the ArrayList if the item is present, replaces if it is. 
			ItemOrder temp = list.get(i);		//if item isn't present, adds it.
			if (item.getItem() == temp.getItem()) {
				list.set(i, item);
				replaceItem = true; //Boolean variable that marks true if item was replaced.
			}
		}

		if (!replaceItem) { //Adds item to order if the item wasn't found in cart.
			list.add(item);
		}

		replaceItem = false; //resets the item replacement for future orders.
		total = 0; //Calculates the total price of the items in the current order.
		for (int i = 0; i < list.size(); i++) {
			total += list.get(i).getPrice();
		}
	}

	public void setDiscount(boolean value) { //Sets discount if chosen.
		if (value && !discountUsed) { //If the discount is used, multiplies total by .9 to add discount.
			total *= (0.9);
			discountUsed = true;
		} else { //If discount is unchecked, resets the price to previous selection and changes boolean back to false.
			total /= (0.9);
			discountUsed = false;
		}
	}

	public double getTotal() { //returns the total price of the order.
		return total;
	}

}
