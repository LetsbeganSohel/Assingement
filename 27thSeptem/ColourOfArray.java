package Private.Ltd;

import java.util.Scanner;

public class ColourOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println(" Enter the size of the array");
		int n= sc.nextInt();
		String arr[]= new String[15];
		System.out.println(" enter your colour");
		for(int i =0; i<= n;i++) {
			arr[i]=sc.next();
		}
for(int i=0;i<=n;i++) {
	System.out.print(arr[i]+" ");
}
	}

}
