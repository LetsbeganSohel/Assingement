package Private.Ltd;
import java.util.Arrays;
//Question - 4
// Write a Java program to insert an element (specific position)into an array. 
public class InsertElemArry {
	public static void main(String[] args) {
		int arr[]= {13,15,17,15,11};
		int indexPos=2;
		int val=20;
		System.out.println(" the  orginal array is : " + Arrays.toString(arr));
		for(int i=arr.length-1;i>indexPos;i--) {
			arr[i]=arr[i-1];
		}
			arr[indexPos]=val;
		System.out.println(" the new array is : " + Arrays.toString(arr));
	}

}
