package Private.Ltd;
import java.util.Scanner;
public class AverageNumber {
	public static void main(String[] args) {
		int avg=0,sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the sixe of the array");
	int n = sc.nextInt();
	int arr[]=new int[10];
	System.out.println("Enter your choise");
	for(int i=0;i<=n-1;i++) {
	 arr[i]=sc.nextInt();
	}
	for(int i:arr) {
		sum=sum+i;
		avg=  sum/n;
		
	}
	System.out.println("The avarage is :" + avg);
	}

}
