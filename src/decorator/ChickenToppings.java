package decorator;

public class ChickenToppings extends Pizza {
	Pizza pizza;
	public ChickenToppings(Pizza pizza) {
		super();
		this.pizza = pizza;
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 3 + pizza.cost();
	}

}
