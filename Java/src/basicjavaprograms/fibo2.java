package basicjavaprograms;

public class fibo2 {
      public static void main(String [] args) {
    	  fiboseries(10);  
      }
      
      public static void fiboseries(int n) {
    	  int a=0,b=1;
    	  for(int i=0;i<=n;i++) {
    		 System.out.println(a);
    		 int temp =a+b;
    		 a=b;
    		 b=temp;
    	  } 
    	  
      }
}
