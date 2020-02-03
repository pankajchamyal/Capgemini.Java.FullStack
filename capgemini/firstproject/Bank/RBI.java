package capgemini.firstproject.Bank;
import java.util.Scanner;

public abstract class RBI {
	double Balance=0,AddInterest,WithdrawInterest,MinBalance;int WithdrawCounter=0,AddCounter=0;
	public void Display(double balance)
	{
	}
	public double getBalance() {
		return Balance;
	}
	public void setBalance(double balance) {
		Balance = balance;
	}
	public double getAddInterest() {
		return AddInterest;
	}
	public void setAddInterest(double addInterest) {
		AddInterest = addInterest;
	}
	public double getWithdrawInterest() {
		return WithdrawInterest;
	}
	public void setWithdrawInterest(double withdrawInterest) {
		WithdrawInterest = withdrawInterest;
	}
	public double getMinBalance() {
		return MinBalance;
	}
	public void setMinBalance(double minBalance) {
		MinBalance = minBalance;
	}
	public int getWithdrawCounter() {
		return WithdrawCounter;
	}
	public void setWithdrawCounter(int withdrawCounter) {
		WithdrawCounter = withdrawCounter;
	}
	public int getAddCounter() {
		return AddCounter;
	}
	public void setAddCounter(int addCounter) {
		AddCounter = addCounter;
	}
	public void AddAmount(Scanner in) {
		System.out.println("Enter the money to be Deposited");
		int add=in.nextInt();
		
		setAddCounter(getAddCounter()+1);
		if(getAddCounter()<=3)
		{
			setBalance(getBalance()+add);
		}
		else
		{
			setBalance(getBalance()+add);
			setBalance(getBalance()+getBalance()*getAddInterest());
		}
		System.out.println("The Balance is "+getBalance());
	}
	public void WithdrawAmount(Scanner in)
	{
		System.out.println("Enter the money to be Withdrawn");
		int with=in.nextInt();
		setWithdrawCounter(getWithdrawCounter()+1);
		if(getBalance()-with>=getMinBalance())
		{
		if(getWithdrawCounter()<=3)
		{
			setBalance(getBalance()-with);
		}
		else
		{
			setBalance(getBalance()-with);
			setBalance(getBalance()-getBalance()*getWithdrawInterest());
		}
		}
		else
		{
			System.out.println("Not enough Balance ");
		}
		System.out.println("The Balance is "+getBalance());
		}
}