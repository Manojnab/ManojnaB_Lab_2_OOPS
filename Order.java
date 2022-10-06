package PizzaPastaOrdering;

import java.util.Scanner;

public class Order {
	Scanner sc=new Scanner(System.in);
	public void orderFood() {
		Menu menu=new Menu();
		Food[] food=new Food[4];
		food=menu.showMenu();
		System.out.println("pizza has below mentioned toppings");
		menu.PizzaTopings();
		System.out.println(food);
		//Order order=new Order();
		int totalbill=0;
		while(true) {
			System.out.println("Enter the menu number to continue ordering \n if the customer doesn't have anything to order then press 0");
		//System.out.println("select the menu and enter the corresponding menu number");
			int menuNumber=sc.nextInt();
			if(menuNumber!=0) {
		System.out.println("enter the qty for the above item");
		int qty=sc.nextInt();
		int price=food[(menuNumber-1)].getPrice();
		OrderRequest orderRequest=new OrderRequest(false);
		int sum=orderRequest.getFinalBill(price, qty);
		totalbill+=sum;
		System.out.println("total bill so far will be "+totalbill);
		System.out.println("This is the final bill and the item is being prepared");
			}
			else if(menuNumber==0) {
				break;
			}
			}
		}
}
