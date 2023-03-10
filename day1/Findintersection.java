package week.day2Assignments;

public class Findintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,5,8};
int b[]= {5,2,9,10};
System.out.println("Print intersection numbers");
for(int i=0;i<a.length;i++) {
	for(int j=0;j<b.length;j++) {
		if(a[i]==b[j]) {
			System.out.println(b[j]);
		}
	}
}
	}

}
