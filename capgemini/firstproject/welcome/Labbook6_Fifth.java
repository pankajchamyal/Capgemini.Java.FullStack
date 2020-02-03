package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook6_Fifth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook6_Fifth mObject = new Labbook6_Fifth();
		System.out.println(mObject.display(mObject));
	}

	String display(Labbook6_Fifth mObject) {
		System.out.println("Enter the String");
		try {
			mObject.num = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String str=""+num;
		StringBuffer str2=new StringBuffer("");
		for(int i=0;i<str.length()-1;i++)
			str2.append(Math.abs((int)str.charAt(i)-(int)str.charAt(i+1)));
		str2.append(str.charAt(str.length()-1));
		return(str2.toString());
	}
}
