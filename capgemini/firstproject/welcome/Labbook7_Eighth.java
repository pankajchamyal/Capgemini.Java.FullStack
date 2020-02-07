package capgemini.firstproject.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Labbook7_Eighth
{
	int size=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook7_Eighth mObject = new Labbook7_Eighth();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		int array[] = new int[mObject.size];
		System.out.println("Enter Elements");
		for (int i = 0; i < mObject.size; i++)
			array[i] = in.nextInt();
		System.out.println("Modified Array");
		System.out.println(mObject.modifyArray(array));
		in.close();
		}
	ArrayList<Integer> modifyArray(int[] array) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(int i:array)
			arr.add(i);
		Set<Integer> set=new LinkedHashSet<>();
		set.addAll(arr);
		arr.clear();
		arr.addAll(set);
		Collections.sort(arr);
		Collections.reverse(arr);
		return arr;
	}

}
