import java.util.ArrayList;

public class Catalog {

	private ArrayList<Item> list = new ArrayList<>(); //ArrayList of items in the catalog
	private String catalogName; //Name of the given catalog
	
	public Catalog(String catalogName) {
		this.catalogName = catalogName; //instantiates the catalog name.
	}

	public void add(Item item) { //Adds items to the catalog.
		list.add(item);
	}

	public int size() { //returns the size of the ArrayList of items in the catalog.
		return list.size();
	}

	public Item get(int index) { //returns the item at the given index.
		return list.get(index);
	}

	public String getName() { //returns a string text of the catalog name.
		return catalogName;
	}
}
