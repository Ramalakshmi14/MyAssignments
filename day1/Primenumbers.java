package Week1.day1;

public class Primenumbers {

	public static void main(String[] args) {
		// Print prime numbers
		int n=12;
		boolean flag=true;
		for (int i=2; i<=n/2; i++) {
			if(n%i==0) {
				System.out.println("Non Prime");
				flag=false;
				break;
			}
			}
		if(flag)
		{
			System.out.println("Prime number");
		}
	
}
}