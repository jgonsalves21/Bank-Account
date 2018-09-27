
public class BankAccountTest {

	public static void main(String[] args) 
	{
		
		BankAccount account1 = new BankAccount("Josh", 1);
		account1.deposit(5000);
		System.out.println(account1.getBalance());
		
		BankAccount account2 = new BankAccount("Michael", 2, 5000);
		account2.deposit(5000);
		System.out.println(account2.getBalance());
		
		BankAccount account3 = new BankAccount("Kevin", 2, 10000);
		account3.withdraw(5000);
		System.out.println(account3.getBalance());
		
		System.out.println(account1.toString());

	}

}
