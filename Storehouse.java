import java.util.ArrayList;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;

public class Storehouse {
	private Map<String, Integer> pStock;
	private Map<String, Integer> pPrice;

	public Storehouse() {
		this.pStock = new HashMap<String, Integer>();
		this.pPrice = new HashMap<String, Integer>();
	}

	public void addProduct(String product, int price, int stock) {
		this.pStock.put(product, stock);
		this.pPrice.put(product, price);
	}

	public int price(String product) {
		if (this.pPrice.containsKey(product)) {
			return this.pPrice.get(product);
		} else {
			return -99;
		}
	}

	public int stock(String product) {
		if (this.pStock.containsKey(product)) {
			return this.pStock.get(product);
		} else {
			return 0;
		}
	}

	public boolean take(String product) {
		if (this.pStock.containsKey(product) && this.pStock.get(product) > 0) {
			this.pStock.put(product, this.pStock.get(product) - 1);
			return true;
		} else {
			return false;
		}
	}

	public Set<String> products() {
		Set<String> test = new HashSet<String>();

		for (String key : this.pPrice.keySet()) {
			test.add(key);
		}

		return test;
	}

	public static void main(String[] args) {
		Storehouse store = new Storehouse();
		store.addProduct("milk", 3, 10);
		store.addProduct("coffee", 5, 7);

		System.out.println("Prices:");
		System.out.println("milk: " + store.price("milk"));
		System.out.println("coffee: " + store.price("coffee"));
		System.out.println("sugar: " + store.price("sugar"));
		
		System.out.println("==========");
		
		store = new Storehouse();
		store.addProduct("coffee", 5, 1);

		System.out.println("stocks:");
		System.out.println("coffee:  " + store.stock("coffee"));
		System.out.println("sugar: " + store.stock("sugar"));

		System.out.println("we take a coffee " + store.take("coffee"));
		System.out.println("we take a coffee " + store.take("coffee"));
		System.out.println("we take sugar " + store.take("sugar"));

		System.out.println("stocks:");
		System.out.println("coffee:  " + store.stock("coffee"));
		System.out.println("sugar: " + store.stock("sugar"));

		System.out.println("==========");
		
		store = new Storehouse();
        store.addProduct("milk", 3, 10);
		store.addProduct("coffee", 5, 6);
		store.addProduct("buttermilk", 2, 20);
		store.addProduct("jogurt", 2, 20);

		System.out.println("products:");
		for (String product : store.products()) {
			System.out.println(product);
		}
	}
}
