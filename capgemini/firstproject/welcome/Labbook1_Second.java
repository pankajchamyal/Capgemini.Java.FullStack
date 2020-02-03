package capgemini.firstproject.welcome;

public class Labbook1_Second {
	int natural_number=150;
	public static void main(String[] args) {
		Labbook1_Second mObject=new Labbook1_Second();
		System.out.println(mObject.calculateDifference(mObject.natural_number));
		}
	int calculateDifference(int n)
	{
		int sum=(n*(n+1)*(2*n+1))/6;
		int sq=(n*(n-1)/2)*(n*(n-1)/2);
		sum=sum-sq;
		return sum;
	}
}
