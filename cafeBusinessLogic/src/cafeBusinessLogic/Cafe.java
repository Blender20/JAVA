package cafeBusinessLogic;

import java.util.ArrayList;

public class Cafe 

{
	private int sum;

	public int getStreakGoal(int weeks)
	{
		for(int i=1;i<=weeks;i++,sum+=i){}
		
		return sum;
	}
	
	public double getTotal()
	{
		double total=0;
		Object items;
		for(int i=0;i<items.length;i++)
		{
			total+=items[i];
		}
		
		return total;
	}
	
	public void displayMenu(ArrayList<String> menuItems)
	{
		for(int i=0;i<menuItems.size();i++)
		{
			System.out.println( i+":"+menuItems.get(i));
//			menuItems.set(i, "hello " + menuItems.get(i));
//			menuItems[i]="hello "+menuItems[i];
		}
		for(String item:menuItems)
		{
			System.out.println(item);
		}
	}
	
};
