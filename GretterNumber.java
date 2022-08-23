// Take three numbers from the user and print the greatest number.

package com.company;
import java.util.Scanner;
public class GretterNumber {

	public static void main(String[] args) {
		Scanner num1=new Scanner(System.in);
		Scanner num2=new Scanner(System.in);;
		Scanner num3=new Scanner(System.in);
		System.out.println("Enter your 1st number");
		int a=num1.nextInt();
		System.out.println("Enter your 2nd number");
		int b=num2.nextInt();
		System.out.println("Enter your 3rd number");
		int c=num3.nextInt();
		if(a>b && a>c) {
			System.out.println("1st is Gretter number");
		}
		else if(b<a && b>c) {
			System.out.println("2nd is   Gretter number");

	}
		else {
			System.out.println("3rd is Gretter");
		}

}
}