package Private.Ltd;
//Question-3
//Write a Java program to copy an array by iterating the array.
public class CopyElementInArray {
	public static void main(String[] args) {
	char [] copyFrom= {'a','b','c','d','e','f'};
	char[] copyTo=new char[3];
	System.arraycopy(copyFrom,0,copyTo,0,3);
	System.out.println(String.valueOf(copyTo));
	}

}
