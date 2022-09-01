package com.company;
import java.util.Scanner;

public class Rectangle {
public void CalculateArea() {
	System.out.println("The Area of the rectangle is calculate using this formula length*width");
}
public void AreaCalculator() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the lenth of the rectangle");
	double a=sc.nextDouble();
	System.out.println("Enter the width of the rectangle");
	double b=sc.nextDouble();
	System.out.print(a*b);
}
	public static void main(String[] args) {
		Rectangle rc=new Rectangle();
		rc.CalculateArea();
		rc.AreaCalculator();

	}

}
