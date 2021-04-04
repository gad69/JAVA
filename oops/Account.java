package oops;

//class = common(variable+methods)
public class Account {
	// common variable
	private long accountNo = 1234;
	private String accountName;
	private double amount;

	// common methods
	public void withdraw(long accountNo, double wamount) {
		if (amount >= wamount && accountNo == accountNo) {
			amount = amount - wamount;
			System.out.println("Successfully withdraw completed");
			System.out.println("Your Account Number = " + accountNo);
			System.out.println("Updated Balance := " + amount);
		} else {
			System.out.println("Your Blance Low Current Balance = " + amount);
		}
	}

	public void depoist(long accountNo, double damount) {

		amount = amount + damount;
		System.out.println("Successfully depost completed");
		System.out.println("Your Account Number = " + accountNo);
		System.out.println("Updated Balance = " + amount);

	}

	public void test() {
		Account savingAccount = new Account();
	}

	public static void main(String[] args) {
		// Object = instance of class
		Account savingAccount = new Account();
		savingAccount.accountName = "abc";
		savingAccount.depoist(1234, 10000);
		savingAccount.withdraw(1234, 5000);
	}

}
