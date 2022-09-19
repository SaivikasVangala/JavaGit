
class Bank {
	void form() {
		System.out.println("Name = ______ && Age = ________");
	}

	void submitProof(String id, String address) {
		System.out.println("Id =" + id + " Address = " + address);
	}

	String passBook() {
		return "PassBook";
	}

	String deposit(int amount) {
		System.out.println("Amount given is " + amount);
		return "deposited";
	}
}
public class Customer {
	public static void main(String[] args) {

		Bank b = new Bank();
		b.form();
		b.submitProof("Pan:514ad454844sda", "aadhar: 49549785188");
		System.out.println("Bank returned " + b.passBook());
		System.out.println("Amount " + b.deposit(10000));
	}

}
