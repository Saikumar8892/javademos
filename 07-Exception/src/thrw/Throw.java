package thrw;

public class Throw {

	public static void main(String[] args) {
		Throw obj = new Throw();
		try {
			int withDrawAmount = 4537;
			System.out.println("Withdrawing: " + withDrawAmount);
			obj.withdrawFromATM(withDrawAmount, 4538);
			System.out.println("Amount Withdrawn");
		} catch (RuntimeException ex) {
			System.out.println("Exception Occurred. " + ex.getMessage());
		}
	}
	
	void withdrawFromATM(int withDrawAmount, int accountNumber) {
		int balance = getBalanceFromAccount(accountNumber);
		if (withDrawAmount > balance) {
			throw new RuntimeException("Insufficient Funds");
		}
	}
	
	int getBalanceFromAccount(int accountNumber) {
		return 1000;
	}
}
