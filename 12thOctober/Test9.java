package Private.Ltd;

public class Test9 {

	public static void main(String[] args) {
		String st="i love java";
		int n=st.length();
		 char arr[]=  new char[n]; 
		for( int i =0;i<n;i++) {
			arr[i]=st.charAt(i);
			System.out.println(arr[i]);
		}
		for(int j=0;j<n;j++) {
			for(int k=j+1;k<n;k++) {
				if(arr[j]==arr[k]) {
					System.out.println(  j+" "  +k+"  "+arr[j]+"  "+arr[k]);
					
				}
			}
		}
	}

}
