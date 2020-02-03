package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook5_Fourth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook5_Fourth mObject=new Labbook5_Fourth();
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		String first="",last="";
		System.out.println("Enter the first name and last name");
		try {
			first=br.readLine();
			last=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try
		{
			mObject.validate(first,last);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}

	}
	public void validate(String first,String last) throws MyException
	{
		if(first.length()==0 && last.length()==0){
			throw new MyException("Both name should not be empty"); 
		}
		else if(last.length()==0) {
			throw new MyException("Last Name should not be Empty");
		}
		else if (first.length()==0) {
			throw new MyException("First Name field should not be Empty");
		}
	}

}

