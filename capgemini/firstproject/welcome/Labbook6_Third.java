package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook6_Third
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str="";
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			Labbook6_Third mObject=new Labbook6_Third();
			System.out.println(mObject.display(mObject));
	}
	String display(Labbook6_Third mObject)
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
		StringBuffer str2= new StringBuffer(str);
		return str+"|"+str2.reverse();
	}

}
