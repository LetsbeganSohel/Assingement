package Private.Ltd;
//Question-2
//Write a Java program to remove a specific element from an array.
import java.util.Arrays;

public class RemoveElemFromArray {
	public static void main(String[] args) {
		int arr2[]= {23,12,54,45,76};
		System.out.println(" the  orginal array is : " + Arrays.toString(arr2));
		int removeIndex=2;
		for(int i=removeIndex;i<arr2.length-1;i++) {
			arr2[i]=arr2[i+1];
			System.out.println("After removing" +Arrays.toString(arr2));
		}

	}

}
