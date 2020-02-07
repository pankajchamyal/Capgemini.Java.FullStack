package capgemini.firstproject.Banking;

public class Customer {
	String Name, bankname;double balance;

	Customer(String Name, String bankname, double balance)
	{
		setName(Name);
		setBankname(bankname);
		setBalance(balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

}