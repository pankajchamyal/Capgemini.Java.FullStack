package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Scanner;

public class Labbook7_Third {
int size=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook7_Third mObject = new Labbook7_Third();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		int array[] = new int[mObject.size];
		for (int i = 0; i < mObject.size; i++)
			array[i] = in.nextInt();
		System.out.println(mObject.getSquares(array));
		in.close();
		}
	HashMap<Integer,Integer> getSquares(int[] array)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<size;i++)
			hm.put(array[i],array[i]*array[i]);
		return hm;
	}

}
