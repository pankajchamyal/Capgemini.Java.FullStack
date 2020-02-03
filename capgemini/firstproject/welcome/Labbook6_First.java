package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Labbook6_First
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str="";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Labbook6_First mObject=new Labbook6_First();
		mObject.display(mObject);
	}
	public void display(Labbook6_First mObject)
	{
		System.out.println("Enter the String");
		try {
			mObject.str=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int temp,sum=0;
		StringTokenizer st1= new StringTokenizer(str," ");
		while (st1.hasMoreTokens())
		{
            temp=Integer.parseInt(st1.nextToken());
            System.out.println(temp);
            sum=sum+temp;
		}
		System.out.println(sum);
	}

}
