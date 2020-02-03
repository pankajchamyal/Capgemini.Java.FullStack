package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook4_First {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Labbook4_First mObject = new Labbook4_First();
		System.out.println("Enter the number");
		int n=0;
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		try {
			n=Integer.parseInt(br.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		mObject.cube(n);
		}
	public void cube(int n)
	{
		int a,b=0;
		while(n!=0)
		{
			a=n%10;
			b=b+a*a*a;
			n=n/10;
		}
		System.out.println(b);
	}

}
