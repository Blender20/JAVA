package zoo_Keeper;

public class Bat extends Mammal
{
	public Bat()
	{
		energyLevel=300;
	}
	
	void fly()
	{
		System.out.println("Whoosh Whoosh Whoosh");
		energyLevel-=50;
	}
	
	void eatHumans()
	{
		System.out.println("Crunch Crunch Crunch");
		energyLevel+=25;
	}
	
	void attackTown()
	{
		System.out.println("Sounds of burning fire.");
		energyLevel-=100;
	}
};
