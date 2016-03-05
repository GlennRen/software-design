public class TomatoSauce extends ToppingDecorator {
	public TomatoSauce(Pizza newPizza) {
		super(newPizzza);

		System.out.println("Adding Sauce");
	}

	public String getDescription() {
		return temp.getDescription() + ", Tomato Sauce";
	}

	public double getCost() {
		return tempPizza.getCost() + .35;
	}
}