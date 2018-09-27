/**
 * 
 * @author jgonsalves21
 * BankAccount
 *
 */
public class BankAccount {

	//Fields
	private String name;
	
	private int accNum;
	
	private double balance;
	
	//Constructors
	public BankAccount(String a, int b)
	{
		name = a;
		accNum = b;
		balance = 0;
	}
	
	public BankAccount(String a, int b, double c) 
	{
		name = a;
		accNum = b;
		balance = c;
	}
	
	//Methods
	public void deposit(double a) 
	{
		balance += a;
	}
	
	public void withdraw(double b)
	{
		balance -= b;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Account Holder: " + name + ", Account Number: " + accNum + ", Account Balance: " + balance;
	}
	
	}
	
	
	
