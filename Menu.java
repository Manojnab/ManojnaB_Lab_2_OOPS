package PizzaPastaOrdering;

import PizzaPastaOrdering.Pizza.PizzaType;
import PizzaPastaOrdering.Pizza.pizzaCrust;
import PizzaPastaOrdering.Pizza.pizzaSize;

public class Menu {
	private Food[] food;

	public Menu() {
		food=new Food[22];
		food[0]=new whiteSaucePasta(10,"White Sauce Pasta","penne");
		food[1]=new RedSaucePasta(20,"Red Sauce Pasta","detalini");
		food[2]=new whiteSaucePasta(10,"White Sauce Pasta","detalini");
		food[3]=new RedSaucePasta(20,"Red Sauce Pasta","penne");
		food[4]=new Pizza(20,"pizza",PizzaType.vegetarian,pizzaSize.small,pizzaCrust.thin);
		food[5]=new Pizza(20,"pizza",PizzaType.vegetarian,pizzaSize.small,pizzaCrust.tick);
		food[6]=new Pizza(40,"pizza",PizzaType.vegetarian,pizzaSize.medium,pizzaCrust.thin);
		food[7]=new Pizza(40,"pizza",PizzaType.vegetarian,pizzaSize.medium,pizzaCrust.tick);
		food[8]=new Pizza(60,"pizza",PizzaType.vegetarian,pizzaSize.large,pizzaCrust.thin);
		food[9]=new Pizza(60,"pizza",PizzaType.vegetarian,pizzaSize.large,pizzaCrust.tick);
		food[10]=new Pizza(15,"pizza",PizzaType.vegan,pizzaSize.small,pizzaCrust.thin);
		food[11]=new Pizza(15,"pizza",PizzaType.vegan,pizzaSize.small,pizzaCrust.tick);
		food[12]=new Pizza(30,"pizza",PizzaType.vegan,pizzaSize.medium,pizzaCrust.thin);
		food[13]=new Pizza(30,"pizza",PizzaType.vegan,pizzaSize.medium,pizzaCrust.tick);
		food[14]=new Pizza(45,"pizza",PizzaType.vegan,pizzaSize.large,pizzaCrust.thin);
		food[15]=new Pizza(45,"pizza",PizzaType.vegan,pizzaSize.large,pizzaCrust.tick);
		food[16]=new Pizza(25,"pizza",PizzaType.nonveg,pizzaSize.small,pizzaCrust.thin);
		food[17]=new Pizza(25,"pizza",PizzaType.nonveg,pizzaSize.small,pizzaCrust.tick);
		food[18]=new Pizza(50,"pizza",PizzaType.nonveg,pizzaSize.medium,pizzaCrust.thin);
		food[19]=new Pizza(50,"pizza",PizzaType.nonveg,pizzaSize.medium,pizzaCrust.tick);
		food[20]=new Pizza(75,"pizza",PizzaType.nonveg,pizzaSize.large,pizzaCrust.thin);
		food[21]=new Pizza(75,"pizza",PizzaType.nonveg,pizzaSize.large,pizzaCrust.tick);

	}
	public Food[] showMenu() {
		Food localfood[]=new Food[4];
		System.out.println("see the below Menu Item and select");
		for(int i=0;i<food.length;i++) {
			System.out.println((i+1)+food[i].getName()+"  "+food[i].getPrice());
		}
		localfood=food;
		return localfood;
	}
	/*public Food[] getFood() {
		return food;
	}*/
	public String[] PizzaTopings() {
		String str[]=new String[] {"cheese","mushroom","tomato"};
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
		return str;
		
		
	}
	public void setFood(Food[] food) {
		this.food = food;
	}
	
	
}
