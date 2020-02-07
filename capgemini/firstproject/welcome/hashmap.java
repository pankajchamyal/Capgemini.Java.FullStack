package capgemini.firstproject.welcome;

import java.util.*;
import java.util.Map.Entry; 

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of instances");
		int n=in.nextInt();String name,bank;String accno;
		HashMap<String,Customer> hm1=new HashMap<String,Customer>();
		Random rn= new Random();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter "+i);
			System.out.println("Enter the name");
			name=in.next();
			System.out.println("Enter the bank");
			bank=in.next();
			Customer c1 = new Customer(name,bank);
			accno=""+(10000+rn.nextInt(90000));
			hm1.put(accno, c1);
		}
		Iterator<Entry<String, Customer>> i = hm1.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Customer> entry=(Entry<String, Customer>) i.next();
			System.out.println("key "+entry.getKey()+" value "+entry.getValue().getBankname()+" "+entry.getValue().getName());
			
		}
		in.close();
	}
}