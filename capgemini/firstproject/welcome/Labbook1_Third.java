package capgemini.firstproject.welcome;

public class Labbook1_Third {
	int num=16;
	static void main(String[] args) 
	{
		Labbook1_Third mObject = new Labbook1_Third();
		System.out.println(mObject.checkNumber(mObject.num));
	}
	boolean checkNumber(int number)
	{
		return (number>0)&&((number&(number-1))==0);
	}
}
