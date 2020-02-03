package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Labbook3_First {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Labbook3_First mObject = new Labbook3_First();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=in.nextInt();
		int array[]=new int[size];
		for(int i=0;i<size;i++)
			array[i]=in.nextInt();
		System.out.println(mObject.getSecondSmallest(array,size));
		in.close();
	}
	
	int getSecondSmallest(int arr[],int size)
	{
		for(int i=0;i<size-1;i++)
			for(int j=0;j<size-i-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		return arr[1];
	}

}
