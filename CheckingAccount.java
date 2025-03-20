
public class CheckingAccount extends BankAccount {
	double overdraftLimit;

	@Override
	public double withdraw(double amount) {
		if (amount > (balance + overdraftLimit)) {
			System.out.println("Withdrawal unsuccesful");
		} else { 
			System.out.println("Withdrawal succesful");
			return balance = balance - amount;
		}
	}
	
	
}
