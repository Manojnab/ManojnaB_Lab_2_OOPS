package PizzaPastaOrdering;

import java.util.Scanner;

import PizzaPastaOrdering.Pizza.PizzaType;
import PizzaPastaOrdering.Pizza.pizzaCrust;
import PizzaPastaOrdering.Pizza.pizzaSize;

public class ExecutionClass {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.println("press any number to start the day if you dont have anymore customers in queue then press 0");
		int ord=sc.nextInt();
		if(ord!=0) {
		Order order=new Order();
		order.orderFood();
		System.out.println("food is prepared please collect the order");
		}
		else if(ord==0) {
			break;
		}
		}
		
	}
}
