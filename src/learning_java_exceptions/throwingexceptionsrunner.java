package learning_java_exceptions;

class Amount {

	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		this.amount = amount;
		this.currency = currency;
	}

	public void add(Amount that) throws Exception {
		if (!this.currency.equals(that.currency)) {
			throw new Exception("Currencies don't match");
		}
	}

	@Override
	public String toString() {
		return currency + "" + amount;
	}
}

public class throwingexceptionsrunner {

	public static void main(String[] args) {

		Amount amount1 = new Amount("USD", 100);
		Amount amount2 = new Amount("USD", 100);
		try {
			amount1.add(amount2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(amount1);

	}

}
