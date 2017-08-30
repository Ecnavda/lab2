public class BankMain {

	public static void main(String[] args) {
		System.out.println("Testing default constructor.");
		BankAccount testAccount = new BankAccount();
		System.out.println(testAccount);

		System.out.println("Testing overloaded parameter constructor.");
		testAccount = new BankAccount(1000.0, .06);
		System.out.println(testAccount);

		System.out.println("\nTesting SetInterestRate method.");
		testAccount = new BankAccount();
		System.out.println("testAccount.SetInterestRate(.06)");
		testAccount.SetInterestRate(.06);
		System.out.println("Testing GetInterestRate method.");
		System.out.println("The interest rate is: " + testAccount.GetInterestRate());

		System.out.println("\nTesting MakeDeposit method.");
		testAccount.MakeDeposit(1000.05);
		System.out.println("testAccount.MakeDeposit(1000.05)");
		System.out.println("Testing GetBalance method.");
		System.out.println("The balance is: " + testAccount.GetBalance());
		
		System.out.println("\nTesting MakeWithdrawl method.");
		testAccount.MakeWithdrawl(500.0);
		System.out.println("The balance is: " + testAccount.GetBalance());
		
		System.out.println("\nTesting the Compound method with the existing balance.");
		testAccount.Compound();
		System.out.println("testAccount.Compound()");
		System.out.println("The balance after compound interest is: " + testAccount.GetBalance());

		System.out.println("Done performing tests.");
	}

}