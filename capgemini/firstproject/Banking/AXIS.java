package capgemini.firstproject.Banking;

import java.util.Scanner;
public class AXIS extends RBI
{
	@Override
	public void AddAmount(Scanner in) {
		// TODO Auto-generated method stub
		setAddInterest(0.02);
		super.AddAmount(in);
		}
	@Override
	public void WithdrawAmount(Scanner in) {
		// TODO Auto-generated method stub
		setWithdrawInterest(0.017);
		setMinBalance(4000);
		super.WithdrawAmount(in);
}
}