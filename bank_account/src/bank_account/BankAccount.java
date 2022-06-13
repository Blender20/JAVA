package bank_account;

import java.util.Random;

public class BankAccount 
{
	private double checking;
	private double savings;
	private static int numAccounts;
	private static double totalMoney=0.0D;
	

	private Long id;
	
	public BankAccount()
	{
		this.checking=0;
		this.savings=0;
		this.id=genId();
		numAccounts++;
	}
	
	public BankAccount(double checking, double savings)
	{
		this.checking=checking;
		this.savings=savings;
		this.id=genId();
		numAccounts++;
		BankAccount.totalMoney+=checking+savings;
	}
	
	public Long genId()
	{

//		double rnd=Math.random();
//		Long _id=(long) (100000000.0D+(rnd*999999999-100000000.0D));
//		return _id;
		String _id="";
		for(int i=0;i<9;i++)
		{
			System.out.println(1+Math.random()*9);
			_id+=Math.floor(Math.random()*9)+"";
		}
		return Long.parseLong(_id);
	}
	
	public int Deposit(Double amount, Boolean accountType)
	{
		if((checking-amount )<0||(savings-amount)<0) return 0;
		
		if(accountType)
		{
			savings+=amount;
			
		}
		else
		{
			checking-=amount;
		}
		
		return 0;
		
	}
	
	public double getTotal()
	{
		return checking+savings;
	}
	
	
	public double Withdraw(Double amount,Boolean accountType)
	{
		return amount;
		
	}
		
	public double getChecking() {
		return checking;
	}

	public void setChecking(double checking) {
		this.checking = checking;
	}

	public double getSavings() {
		return savings;
	}

	public void setSavings(double savings) {
		this.savings = savings;
	}

	public static double getTotalMoney() {
		return totalMoney;
	}

	public static void setTotalMoney(double totalMoney) {
		BankAccount.totalMoney = totalMoney;
	}
	
};
