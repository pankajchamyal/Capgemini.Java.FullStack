package capgemini.firstproject.Banking;

import java.util.Scanner;

public class SC extends RBI
{
	@Override
	public void AddAmount(Scanner in) {
		// TODO Auto-generated method stub
		setAddInterest(0.038);
		super.AddAmount(in);
		}
	@Override
	public void WithdrawAmount(Scanner in) {
		// TODO Auto-generated method stub
		setWithdrawInterest(0.03);
		setMinBalance(5000);
		super.WithdrawAmount(in);
		}
}