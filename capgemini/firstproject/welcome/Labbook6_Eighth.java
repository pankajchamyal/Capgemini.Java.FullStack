package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook6_Eighth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook6_Eighth mObject = new Labbook6_Eighth();
		System.out.println(mObject.display(mObject));
	}

	boolean display(Labbook6_Eighth mObject) {
		System.out.println("Enter the String");
		try {
			mObject.str = br.readLine();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				br.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			int count=0;
			str=str.toLowerCase();
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i)>str.charAt(i+1)) {
					count++;
					break;}
			}
			if(count==0)
				return true;
			else
				return false;
	}
}