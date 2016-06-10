package decorator;

public class Test {
	public static void main(String[] a){
		Pizza pizza = new MexicanWave();
		System.out.println(pizza.cost());
		pizza = new Cheese(pizza);
		System.out.println(pizza.cost());
		pizza = new Cheese(pizza);
		System.out.println(pizza.cost());
		pizza = new VegToppings(pizza);
		System.out.println(pizza.cost());

	}
}
