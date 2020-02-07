package capgemini.firstproject.Banking;

import java.util.Scanner;

public class ICICI extends RBI
{
	@Override
	public void AddAmount(Scanner in) {
		// TODO Auto-generated method stub
		setAddInterest(0.023);
		super.AddAmount(in);
		}
	@Override
	public void WithdrawAmount(Scanner in) {
		// TODO Auto-generated method stub
		setWithdrawInterest(0.015);
		setMinBalance(3000);
		super.WithdrawAmount(in);
		}
}