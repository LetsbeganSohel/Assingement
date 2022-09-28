package Private.Ltd;

public class MaximumNumberinArray {

	public static void main(String[] args) {
		int a[]= {18,23,7,89,25};                       // Decleared A array
		System.out.print("The largest number is :" + largenum( a));
	}
		 static int largenum(int a[]) {
			int max=a[0];
			for(int i=0;i<=a.length-1;i++) {
				if(a[i]>max) {
					max=a[i];
						
				}
			}
			 return max; 
			
		}
		
	}


