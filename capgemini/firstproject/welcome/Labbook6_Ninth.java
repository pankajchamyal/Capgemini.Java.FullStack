package capgemini.firstproject.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Period;

public class Labbook6_Ninth {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str="";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labbook6_Ninth mObject = new Labbook6_Ninth();
		mObject.display(mObject);
	}

	void display(Labbook6_Ninth mObject) {
		System.out.println("Enter the date in dd/mm/yyyy format");
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
		String ar[]=str.split("/");
		LocalDate date=LocalDate.of(Integer.parseInt(ar[2]),Integer.parseInt(ar[1]),Integer.parseInt(ar[0]));
		LocalDate now = LocalDate.now();
		Period diff=Period.between(date, now);
		System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(),
				diff.getDays());

}
}