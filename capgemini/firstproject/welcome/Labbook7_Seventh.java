package capgemini.firstproject.welcome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Labbook7_Seventh {
	int size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook7_Seventh mObject = new Labbook7_Seventh();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		int array[] = new int[mObject.size];
		for (int i = 0; i < mObject.size; i++)
			array[i] = in.nextInt();
		System.out.println(mObject.getSorted(array));
		in.close();
	}

	ArrayList<Integer> getSorted(int[] array) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < size; i++) {
			sb = sb.append(array[i]);
			String str = sb.reverse().toString();
			arr.add(Integer.valueOf(str));
			sb = new StringBuilder("");
		}
		Collections.sort(arr);
		return arr;
	}

}
