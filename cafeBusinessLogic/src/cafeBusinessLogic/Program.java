package cafeBusinessLogic;

import java.util.ArrayList;

public class Program 
{
	public static void main(String[] args)
	{
		Cafe starbucks=new Cafe();
		starbucks.getStreakGoal(23);
		System.out.println(streak);
		
		double items[]= {44.12, 67.35, 12.54, 65.76};
		double total=starbucks.getTotal(items);
		System.out.println(total);
		
		ArrayList<String> beverages=new ArrayList<String>();
		beverages.add("drip coffee");
		beverages.add("cappuccino");
		beverages.add("latte");
		beverages.add("mocha");
		
		starbucks.displayMenu(beverages);
	}
};
