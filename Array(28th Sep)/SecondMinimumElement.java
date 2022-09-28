package Private.Ltd;
//Question-6
//Write a Java program to find the second smallest element  in an array. 
import java.util.Arrays;
public class SecondMinimumElement {

	public static void main(String[] args) {
		int arr[]= {12,13,14,3,67,23};
		Arrays.sort(arr);
		System.out.println("The second last Element is "+ arr[1]);
	}

}
