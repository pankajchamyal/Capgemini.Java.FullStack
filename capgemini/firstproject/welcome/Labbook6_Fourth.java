package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook6_Fourth
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String str="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook6_Fourth mObject=new Labbook6_Fourth();
		System.out.println(mObject.display(mObject));
	}
	String display(Labbook6_Fourth mObject)
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
		String str2="AEIOU";
		String str3="aeiou";
		StringBuilder str4= new StringBuilder("");
		
		for(int i=0;i<str.length();i++)
		{int count=0;
			for(int j=0;j<5;j++)
				if(str.charAt(i)==str2.charAt(j)||str.charAt(i)==str3.charAt(j))
					count++;
			if(count>0)
				str4.append((char)str.charAt(i));
			else
				str4.append((char)(str.charAt(i)+1));
		}
		return str4.toString();
	}
}
