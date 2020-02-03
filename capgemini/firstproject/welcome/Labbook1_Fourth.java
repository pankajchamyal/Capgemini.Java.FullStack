package capgemini.firstproject.welcome;

public class Labbook1_Fourth {
	int num=31;
	public static void main(String[] args) 
	{
		Labbook1_Fourth mObject = new Labbook1_Fourth();
		System.out.println(mObject.checkNumber(mObject.num));
	}
	boolean checkNumber(int number)
	{
		return (number>0)&&((number&(number-1))==0);
	}
}
