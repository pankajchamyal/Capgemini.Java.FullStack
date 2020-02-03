package capgemini.firstproject.welcome;
import com.cg.eis.exception.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Labbook5_Sixth {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		EmployeeException mexception=new EmployeeException(null);
		int salary=0;
		System.out.println("Enter the salary");
		try {
			salary=Integer.parseInt(br.readLine());
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
				mexception.check(salary);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		
	}
	}

