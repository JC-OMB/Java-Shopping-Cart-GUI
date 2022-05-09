public class ItemOrder {
	private Item item; //Initializes item to receive a name and price.
	private int quantity; 

	public ItemOrder(Item item, int quantity) { //constructor that instantiates the item (with name and price) and quantity.
		this.item = item;
		this.quantity = quantity;
	}

	public double getPrice() { //returns the price for a specific item given the quantity requested.
		return item.priceFor(quantity);
	}

	public Item getItem() { //returns the reference of the item.
		return item;
	}

	@Override
	public String toString() { //prints a string representation of the item.
		return getItem().toString();
	}

}
