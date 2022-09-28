package Private.Ltd;
import java.util.Scanner;
// Question-1
//Write a Java program to find the index of an array element
public class IndexOfArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int index=-1;
		for(int i =0; i<n;i++) {
			System.out.println("Enter the " +i +"  th"+ "element of the array" );
			arr[i]=sc.nextInt();
			}
		System.out.println("Enter the number which index you find");
		int element=sc.nextInt();
		 for(int i=0;i<n;i++) {
	    	 if(arr[i]==element) {
	    		 index=i;
	    		 System.out.println(" The index of the element is : "+index);
	    	 }
	     }
	    }	
	}

