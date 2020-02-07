package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Labbook7_Fourth {
int size=0;
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Labbook7_Fourth mObject = new Labbook7_Fourth();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for (int i = 0; i < mObject.size; i++)
		{
			System.out.println("Enter the Registraion Number");
			int rno = in.nextInt();
			System.out.println("Enter the Marks");
			int marks=in.nextInt();
			hm.put(rno,marks);
		}
		System.out.println(mObject.getStudents(hm));
		in.close();
	}
	HashMap<Integer,String> getStudents(HashMap<Integer,Integer> hm)
	{
		HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
		Iterator<Entry<Integer, Integer>> itr=hm.entrySet().iterator();
		while(itr.hasNext())
		{
		Map.Entry<Integer, Integer> entry=(Map.Entry<Integer, Integer>)itr.next();
		if(entry.getValue()>=90)
			hm2.put(entry.getKey(),"GOLD");
		else if(entry.getValue()>=80)
			hm2.put(entry.getKey(),"Sliver");
		else if(entry.getValue()>=70)
			hm2.put(entry.getKey(),"Bronze");
		}
		return hm2;
	}
}
