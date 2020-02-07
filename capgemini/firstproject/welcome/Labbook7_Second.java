package capgemini.firstproject.welcome;

import java.util.HashMap;
import java.util.Scanner;

public class Labbook7_Second {
	int size = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook7_Second mObject = new Labbook7_Second();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		mObject.size = in.nextInt();
		char array[] = new char[mObject.size];
		for (int i = 0; i < mObject.size; i++)
			array[i] = in.next().charAt(0);
		System.out.println(mObject.countCharacter(array));
		in.close();
	}

	HashMap<Character, Integer> countCharacter(char[] array) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < size; i++) {
			if (hm.containsKey(array[i]))
				hm.put(array[i], hm.get(array[i]) + 1);

			else
				hm.put(array[i], 1);
		}
		return hm;

	}
}
