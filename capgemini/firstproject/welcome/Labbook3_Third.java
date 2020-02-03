package capgemini.firstproject.welcome;

import java.util.Scanner;
import java.lang.StringBuilder;
public class Labbook3_Third {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Labbook3_Third mObject = new Labbook3_Third();
Scanner in = new Scanner(System.in);
System.out.println("Enter the length of array");
int size=in.nextInt();
int array[]=new int[size];
for(int i=0;i<size;i++)
	array[i]=in.nextInt();
mObject.getSorted(array,size);
in.close();
	}

	public void getSorted(int array[], int size)
	{
		for(int i=0;i<size;i++)
		{
			StringBuilder mstring=new StringBuilder();
			mstring.append(array[i]);
			String str=mstring.reverse().toString();
			array[i]=Integer.valueOf(str);
			System.out.println(array[i]);
		}
		for(int i=0;i<size-1;i++)
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				}
			}
		for(int i=0;i<size;i++)
		{System.out.println(array[i]);}
	}

}