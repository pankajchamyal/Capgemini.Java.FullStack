package capgemini.firstproject.welcome;

public class Labbook1_First {
	int natural_number=150;
	public static void main(String[] args) {
		Labbook1_First mObject= new Labbook1_First();
		System.out.println("Sum of First 'N' natural numbers which are divisible by 3 or 5 is "+mObject.calculateSum(mObject.natural_number));
	}
	int calculateSum(int number) {
		int sum=0;
		for(int i=1;i<=150;i++)
		{
			if((i%3==0)||(i%5==0))
				sum=sum+i;
		}
		return sum;
	}

}
