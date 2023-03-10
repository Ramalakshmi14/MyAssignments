package week.day2Assignments;

public class MissingNumbersArray {

	public static void main(String[] args) {
		// Array should not have duplicates
		//No need to sort array and array values should be in range
		
int arr[]= {1,2,4,5};
//sum1=12(1+2+4+5)
//sum2=15(1+2+3+4+5)
//sum2-sum1=(15-12)=3
System.out.println("Missing elements in an array");
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=i+1) {
		System.out.println(i+1);
		break;
	}
}


	}

}
