package capgemini.firstproject.welcome;

import java.util.Scanner;

public class Labbook3_Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook3_Second mObject = new Labbook3_Second();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int size=in.nextInt();
		String array[]=new String[size];
		for(int i=0;i<size;i++)
			array[i]=in.nextLine();
		mObject.operation(array,size);
		in.close();}
		public void operation(String array[],int size)
		{
			for(int i=0;i<size-1;i++)
				for(int j=0;j<size-i-1;j++)
				{
					if(array[j].compareTo(array[j+1])>0)
					{
					String temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					}
				}
			for(int i=0;i<size;i++)
				if(i<size/2)
				array[i]=array[i].toUpperCase();
				else
					array[i]=array[i].toLowerCase();
			if(size%2==1)
			{
				array[size/2+1]=array[size/2+1].toUpperCase();
			}
			for(int i=0;i<size;i++)
				System.out.println(array[i]);
		}

}
