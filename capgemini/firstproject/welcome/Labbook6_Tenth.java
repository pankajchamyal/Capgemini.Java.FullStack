package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook6_Tenth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook6_Tenth mObject = new Labbook6_Tenth();
		System.out.println(mObject.validate(mObject));
	}

	boolean validate(Labbook6_Tenth mObject) {
		System.out.println("Enter the string");
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
			}
			}
			if ((str.length()-4)>8) {
				int j=0;
				String test = "_job";
				for(int i=str.length()-4;i<str.length();i++) {
					if (str.charAt(i)!=test.charAt(j)) {
						return false;
					}
					j++;
				}
			}
			else {
				return false;
			}
			return true;
		}
	}