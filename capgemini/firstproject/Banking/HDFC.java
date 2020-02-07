package capgemini.firstproject.Banking;

import java.util.Scanner;

public class HDFC extends RBI
{
	@Override
	public void AddAmount(Scanner in) {
		// TODO Auto-generated method stub
		setAddInterest(0.0275);
		super.AddAmount(in);
		}
	@Override
	public void WithdrawAmount(Scanner in) {
		// TODO Auto-generated method stub
		setWithdrawInterest(0.02);
		setMinBalance(2000);
		super.WithdrawAmount(in);
		}
}