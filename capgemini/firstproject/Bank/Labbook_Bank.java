/*
 * @Author Capgemini
 * @Developer Pankaj Chamyal
 * @Description This class performs banking process. 
 * @Created 27/01/2020
 * @Version 1.0
 * @Status release Beta
 */
package capgemini.firstproject.Bank;

import java.util.Scanner;

public class Labbook_Bank  {
	RBI mRBI;
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Labbook_Bank mObject = new Labbook_Bank();
		mObject.welcome();
	}

	void welcome() {
		System.out.println("Select your bank \n 1. ICICI \n 2. HDFC \n 3. SC \n 4. AXIS");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			mRBI = (ICICI) new ICICI();
			operation(mRBI);
			break;
		case 2:
			mRBI = (HDFC) new HDFC();
			operation(mRBI);
			break;
		case 3:
			mRBI = (SC) new SC();
			operation(mRBI);
			break;
		case 4:
			mRBI = (AXIS) new AXIS();
			operation(mRBI);
			break;
		default:
			System.out.println("Try Again");
			welcome();
			break;
		}
	}

	void operation(RBI mRBI) {
		int flag = 1;
		while (flag == 1) {
			System.out.println("Choose Operation \n 1. Add Money \n 2. Withdraw Money \n 3. STOP");
			int op = in.nextInt();

			switch (op) {
			case 1:
				mRBI.AddAmount(in);
				break;
			case 2:
				mRBI.WithdrawAmount(in);
				break;
			case 3:
				flag = 0;
				break;
			default:
				System.out.println("Try Again");
				operation(mRBI);
				break;
			}
		}
	}
}
