package pattern;

public class StarPattern2 {
	public static void main(String [] args) {
		int n=4;
		 for (int i=0;i<n;i++) {
//			 for(int k=i;k<4;k++) {
//				 System.out.print(" "); 
//			 }
			 for(int k=0;k<i;k++) {
				 System.out.print(" "); 
			 }
			 
			 for(int j=n-i;j>0;j--) {
				 System.out.print("*");
				
			 }
			 
			
			 System.out.println("");
		 }
	 }
  
	
}
