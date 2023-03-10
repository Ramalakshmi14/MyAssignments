package week.day2Assignments;

public class DuplicateArray {

	public static void main(String[] args) {
		// Initialize array
		 int arr[] = new int [] {1,2,3,5,2,8,3,8};
		 System.out.println("Print duplicate elements in array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					System.out.println(arr[j]);
				
				
			}
		}
		

	}

}
