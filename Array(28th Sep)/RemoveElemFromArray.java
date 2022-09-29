package Private.Ltd;
//Question-2
//Write a Java program to remove a specific element from an array.
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElemFromArray {
	public static void main(String[] args) {
		int i;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for( i =0; i<n;i++) {
			System.out.println("Enter the " +i +"  th"+ "element of the array" );
			arr[i]=sc.nextInt();
			}
		System.out.println("The main array is :"+Arrays.toString(arr));
		System.out.println("Enter the index number");
		int index=sc.nextInt();
		for( i=index;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
	     n--;
		System.out.println("The new Array is :");
		for(i=0;i<n;i++) {
			System.out.print("   "+ arr[i]);
		}
	}
}
