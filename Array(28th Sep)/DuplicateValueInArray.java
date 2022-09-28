package Private.Ltd;
import java.util.Scanner;
//Question-7
//Write a Java program to find the duplicate values of an array
public class DuplicateValueInArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i =0; i<n;i++) {
			System.out.println("Enter the" +i +"th"+ "element of the array" );
			arr[i]=sc.nextInt();
			}
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(" The Duplicate one is :" +arr[j]);
					System.out.println(" The Duplicate position is :"+j);
				}
			}
		}

	}

}
