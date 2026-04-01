package pattern;

public class InvertTriangle {
	public static void main(String [] args) {
		
		 int n=5;
	       for(int i=0;i<n;i++){
	    	   for(int k=0;k<=i;k++){
		             System.out.print(" ") ;
		          }
	          for(int j=4-i;j>=0;j--){
	             System.out.print("*") ;
	          } 
	         
	           
	           System.out.println("") ;
	       }
	}
}
