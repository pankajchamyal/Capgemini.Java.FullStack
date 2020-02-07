package capgemini.firstproject.Banking;

import java.util.HashMap;

public class CustomerData
{
	public static HashMap<String, Customer> data()
	{
		Customer c1 = new Customer("Pankaj", "ICICI",10000);
		Customer c2 = new Customer("Piyush", "HDFC",15000);
		Customer c3 = new Customer("Saurabh", "AXIS",9000);
		Customer c4 = new Customer("Siddharth", "SBI",6000);
		Customer c5 = new Customer("Mayank", "ICICI",20000);
		Customer c6 = new Customer("Himanshu", "HDFC",23000);
		Customer c7 = new Customer("Rohit", "AXIS",32000);
		Customer c8 = new Customer("Kapil", "SC",8000);
		HashMap<String, Customer> hm = new HashMap<String, Customer>();
		hm.put("10000", c1);
		hm.put("10001", c2);
		hm.put("10002", c3);
		hm.put("10003", c4);
		hm.put("10004", c5);
		hm.put("10005", c6);
		hm.put("10006", c7);
		hm.put("10007", c8);
		return hm;
	}
	

}
