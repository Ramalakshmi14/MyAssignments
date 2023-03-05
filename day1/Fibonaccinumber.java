package Week1.day1;

public class Fibonaccinumber {

	public static void main(String[] args) {
		// Print fibonacci series for first 11 numbers
		int Firstnum=0;
		int Secondnum=1;
		int sum=0;
		System.out.println("Print fibonacci series");
		for (int i=1;i<=11;i++) { 
			sum = Firstnum + Secondnum;
		System.out.println(sum);
		Firstnum=Secondnum;
		Secondnum=sum;
		
		

	}
	}
}

