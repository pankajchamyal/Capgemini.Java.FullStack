package capgemini.firstproject.welcome;

public class Customer {
	String Name, bankname;

	Customer(String Name, String bankname)
	{
		setName(Name);
		setBankname(bankname);
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