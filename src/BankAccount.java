public class BankAccount {

	private double balance, interestRate;

	BankAccount() {
		balance = 0.0;
		interestRate = 0.0;
	}

	BankAccount(double bal, double ir) {
		this.balance = bal;
		this.interestRate = ir;
	}

	public void SetInterestRate(double ir) {
		this.interestRate = ir;
	}

	public double GetInterestRate() {
		return this.interestRate;
	}

	public double GetBalance() {
		return this.balance;
	}

	public void MakeDeposit(double bal) {
		this.balance += bal;
	}

	public void MakeWithdrawl(double bal) {
		this.balance -= bal;
	}

	public void Compound() {
		this.balance = this.balance * (1.0 + this.interestRate);
	}

	public String toString() {
		return "Balance: " + this.balance + "\nInterest Rate: " + this.interestRate;
	}
}