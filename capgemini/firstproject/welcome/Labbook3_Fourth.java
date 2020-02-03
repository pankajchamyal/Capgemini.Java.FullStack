package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Labbook3_Fourth {
	public static void main(String[] args) {
		Labbook3_Fourth mObject = new Labbook3_Fourth();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size = in.nextInt();
		char array[] = new char[size];
		for (int i = 0; i < size; i++)
			array[i] = in.next().charAt(0);
		mObject.count(array, size);
		in.close();
	}

	public void count(char array[], int size) {
		StringBuilder array2=new StringBuilder("");
		int map[] = new int[256];
		for (int i = 0; i < size; i++) {
			map[array[i]]++;
		}
		array2.append(array[0]);
		for (int i = 1; i < size; i++)
		{
			int count = 0;
			for (int j = 0; j <array2.length(); j++)
				if (array[i] == array2.charAt(j))
					count++;
			if (count == 0)
				array2.append(array[i]);
			else
				i++;
		}
		System.out.println(array2);
		size=array2.length();
		for (int i = 0; i <size; i++) {
			System.out.println(array2.charAt(i) + "=" + map[array2.charAt(i)]);
		}
	}
}
