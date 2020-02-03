package capgemini.firstproject.welcome;

public class FirstClass {
	int minBalance=0;
	public static void main(String[] args) {
		FirstClass mObject=new FirstClass();
		mObject.addAmount(mObject);
		mObject.withdrawAmount(mObject);
	}
	public void showDetails(String message,FirstClass object) {
		System.out.println(message+object.minBalance);
	}
	public void addAmount(FirstClass object) {
		object.minBalance=object.minBalance+5000;
		object.showDetails("Your available updated balance after adding is ",object);
	}
	public void withdrawAmount(FirstClass object) {
		object.minBalance=object.minBalance-1000;
		object.showDetails("Your available updated balance after withdraw is ",object);
		
	}

}
