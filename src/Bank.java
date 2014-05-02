import java.util.ArrayList;


public class Bank
{
	private int numAccounts = 10;
	private ArrayList<Account> accounts = new ArrayList<Account>();
	
	
	public Bank()
	{

		//generate some random accounts
		for(int i=0;i<numAccounts;i++)
			accounts.add(new Account(i,5000));		
	}
	
	public Account getAccount(int accountNum)
	{
		return accounts.get(accountNum);
	}

	public int getNumAccounts()
	{
		return numAccounts;
	}

	public void transfer(Account to, Account from, double amt)
	{
		from.debit(amt);
		to.credit(amt);
	}
	
	public double totalBalance()
	{
		double totalBalance = 0;
		
		for(Account a: accounts)
		{
			totalBalance += a.getBalance();
		}
				
		return totalBalance;
	}
	
	
	
}
