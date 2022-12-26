class Account
{
	private String accountNo;
	private String ownerName;
	private int balance;
	
	public Account(String accountNo, String ownerName, Int balance)
	{
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	void deposit(int amount)
	{
		balance += amount;
	}

	int withdraw(int amount)
	{
		if (balance < amount)
			return 0;
		balance -= amount;
		return amount;
	}
}