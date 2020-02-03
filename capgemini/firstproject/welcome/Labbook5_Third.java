package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook5_Third {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook5_Third mObject=new Labbook5_Third();
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
		for(int i=1;i<=n;i++)
			mObject.checkprime(i);
	}
	public void checkprime(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
			{
			if(n%i==0)
				count++;
			}
		if(count==0)
			System.out.println(n);
	}

}
