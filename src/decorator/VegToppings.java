package decorator;

public class VegToppings extends Pizza {
	Pizza pizza;
	
	public VegToppings(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	@Override
	public double cost() {

		return 5 + pizza.cost();
	}

}
