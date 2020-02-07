/*
 * @Author Capgemini
 * @Developer Pankaj Chamyal
 * @Description This class performs banking process. 
 * @Created 27/01/2020
 * @Version 1.0
 * @Status release Beta
 */
package capgemini.firstproject.Banking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


public class Labbook_Bank  {
	RBI mRBI;CustomerData cus;
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		Labbook_Bank mObject = new Labbook_Bank();
		mObject.welcome();
	}

	void welcome() {
		
		HashMap<String, Customer> hm=CustomerData.data();
		Iterator<Entry<String, Customer>> i = hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Customer> entry=(Entry<String, Customer>) i.next();
			System.out.println("Account Number->"+entry.getKey()+"\nBankName->"+entry.getValue().getBankname()+"\nName->"+entry.getValue().getName()+"\nBalance->"+entry.getValue().getBalance()+"\n\n");
			
		}
		
		System.out.println("Enter the Bank Account Number");
		String choice="";
		String acc=in.nextLine();
		i = hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Customer> entry=(Entry<String, Customer>) i.next();
			if(acc.equals(entry.getKey()))
			{
				choice=entry.getValue().getBankname();
			}
		}
		
		switch (choice) {
		case "ICICI":
			mRBI = (ICICI) new ICICI();
			operation(mRBI);
			break;
		case "HDFC":
			mRBI = (HDFC) new HDFC();
			operation(mRBI);
			break;
		case "SC":
			mRBI = (SC) new SC();
			operation(mRBI);
			break;
		case "AXIS":
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
