package zoo_Keeper;

public class Program 
{
	public static void main(String[] args)
	{
//		Gorilla joe=new Gorilla();
//		joe.throwSomething();
//		joe.throwSomething();
//		joe.throwSomething();
//		
//		joe.eatBananas();
//		joe.eatBananas();
//		
//		joe.climb();
		
//		attack three town, eat tow humans and fly twice.
		Bat petey=new Bat();
		for(int i=0;i<3;i++) petey.attackTown();
		for(int i=0;i<2;i++) petey.eatHumans();
		for(int i=0;i<2;i++) petey.fly();
	}
	
};
