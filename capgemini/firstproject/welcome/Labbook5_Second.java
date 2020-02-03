package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook5_Second
{
	public static void main(String args[])
	{
		Labbook5_Second mObject = new Labbook5_Second();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		System.out.println("Enter the value if n");
		int n=0;
		try {
			n=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(int i=0;i<n;i++)
		System.out.println(mObject.recursive(i));
		mObject.nonrecursive(n);
	}
	int recursive(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
			
			return (recursive(n-1)+recursive(n-2));
	}
	public void nonrecursive(int n)
	{
		int first=-1;
		int second=1;
		int value;
		for(int i=0;i<n;i++)
		{value=first+second;
			System.out.println(value);
			first=second;
			second=value;
		}
		
	}

}
