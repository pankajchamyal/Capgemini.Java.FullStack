package capgemini.firstproject.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Labbook7_First {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Labbook7_First mObject=new Labbook7_First();
		Scanner in = new Scanner (System.in);
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		System.out.println("Enter the size");
		int size=in.nextInt();
		System.out.println("Enter the values");
		for(int i=1;i<=size;i++)
		{
			int value=in.nextInt();
			hm.put(i, value);
		}
		System.out.println(mObject.getValues(hm));
	in.close();	
	}
	ArrayList<Integer> getValues(HashMap<Integer,Integer> hm)
	{
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Iterator<Entry<Integer, Integer>> i=hm.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<Integer, Integer> entry=(Map.Entry<Integer, Integer>)i.next();
			arr.add((Integer) entry.getValue());
		}
		Collections.sort(arr);
		return arr;
	}

}
