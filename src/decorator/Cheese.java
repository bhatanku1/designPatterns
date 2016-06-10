package decorator;

public class Cheese extends Pizza {
	Pizza pizza;
	
	public Cheese(Pizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public double cost() {
		
		return 2 + pizza.cost();
	}

}
