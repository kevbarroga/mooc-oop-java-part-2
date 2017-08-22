import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ShoppingBasket {
	private List<Purchase> purchases;

	public ShoppingBasket() {
		this.purchases = new ArrayList<Purchase>();
	}

	public void add(String product, int price) {
		Purchase purchase = new Purchase(product, 1, price);

		if (!this.purchases.contains(purchase)) {
			this.purchases.add(purchase);
		} else {
			purchase.increaseAmount();
		}
	}

	public int price() {
		int price = 0;
		for (Purchase item : purchases) {
			price += item.price();
		}
		return price;
	}

	public void print() {
		Map<String, Integer> test = new HashMap<String, Integer>();

		for (Purchase item : purchases) {
			String itemName = item.name();

			if (test.containsKey(itemName)) {
				test.put(itemName, test.get(itemName) + 1);
			} else {
				test.put(itemName, 1);
			}
		}

		for (String key : test.keySet()) {
			System.out.println(key + ": " + test.get(key));
		}
	}

	public static void main(String[] args) {
		ShoppingBasket basket = new ShoppingBasket();
		basket.add("milk", 3);
		basket.add("buttermilk", 2);
		basket.add("cheese", 5);
		System.out.println("basket price: " + basket.price());
		basket.add("computer", 899);
		System.out.println("basket price: " + basket.price());

		basket.print();

		System.out.println("===========");

        basket = new ShoppingBasket();

		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");

		basket.add("buttermilk", 2);
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");

		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");

		basket.add("milk", 3);
		basket.print();
		System.out.println("basket price: " + basket.price() +"\n");
	}
}
