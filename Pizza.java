package PizzaPastaOrdering;

public class Pizza extends Food {
	public enum pizzaSize{
		large,medium,small
	}
	public enum pizzaCrust{
		tick,thin
	}
	public enum PizzaType {
		vegan,vegetarian,nonveg
	}

	public PizzaType getpType() {
		return pType;
	}
	public void setpType(PizzaType pType) {
		this.pType = pType;
	}
	public pizzaSize getpSize() {
		return pSize;
	}
	public void setpSize(pizzaSize pSize) {
		this.pSize = pSize;
	}
	public pizzaCrust getpCrust() {
		return pCrust;
	}
	public void setpCrust(pizzaCrust pCrust) {
		this.pCrust = pCrust;
	}
	private PizzaType pType;
	 private pizzaSize pSize;
	 private pizzaCrust pCrust;
	public Pizza(int price, String name,PizzaType pType, pizzaSize pSize, pizzaCrust pCrust) {
		super(price,name);
		this.pType = pType;
		this.pSize = pSize;
		this.pCrust = pCrust;
	}
	
	
}
