abstract class ToppingDecorator implements Pizza {
	protected Pizza tempPizza;

	public ToppingDecorator(Pizza newPizza) {
		tempPizza = new Pizza ();
	}

	public String getDescription() {
		return tempPizza.getDescription();
	}

	public double getCost() {
		return tempPizza.getCost();
	}
}