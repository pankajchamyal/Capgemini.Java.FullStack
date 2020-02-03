package capgemini.firstproject.welcome;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook5_Fifth {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Labbook5_Fifth mObject=new Labbook5_Fifth();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=0;
		System.out.println("Enter the age");
		try {
			a=Integer.parseInt(br.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
		try {
			mObject.validate(a);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	public void validate(int a) throws MyException
	{
		if(a<=15)
		{
			throw new MyException("Age of a person should be above 15");
		}
	}

}
