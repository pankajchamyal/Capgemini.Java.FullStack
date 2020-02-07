package capgemini.firstproject.welcome;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Labbook7_Sixth {
	int size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook7_Sixth mObject = new Labbook7_Sixth();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		for (int i = 0; i < mObject.size; i++) {
			System.out.println("Enter the Id Number");
			int id = in.nextInt();
			System.out.println("Enter the dob in dd/mm/yyyy format");
			String dob = in.next();
			hm.put(id, dob);
		}
		System.out.println(mObject.votersList(hm));
		in.close();
	}

	ArrayList<Integer> votersList(HashMap<Integer, String> hm) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Iterator<Entry<Integer, String>> itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry=(Map.Entry<Integer, String>)itr.next();
			String db[]=((String) entry.getValue()).split("/");
			LocalDate date=LocalDate.of(Integer.parseInt(db[2]),Integer.parseInt(db[1]),Integer.parseInt(db[0]));
			LocalDate now=LocalDate.now();
			Period diff=Period.between(date,now);
			if(diff.getYears()>=18)
				arr.add((Integer) entry.getKey());
		}
		return arr;
	}

}
