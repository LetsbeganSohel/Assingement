package Private.Ltd;
import java.util.Arrays;
import java.util.Scanner;
//Question - 4
// Write a Java program to insert an element (specific position)into an array. 
public class InsertElemArry {
	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n+1];
		for( i =0; i<n;i++) {
			System.out.println("Enter the " +i +"  th"+ "element of the array" );
			arr[i]=sc.nextInt();
			}
		System.out.println("The main array is :"+Arrays.toString(arr));
		System.out.println("Enter the index number");
		int index=sc.nextInt();
		System.out.println("The number you entered");
		int num=sc.nextInt();
		for( i=n;i>index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=num;
	     n++;
		System.out.println("The new Array is :");
		for(i=0;i<n;i++) {
			System.out.print("   "+ arr[i]);
		}
	}	
}
