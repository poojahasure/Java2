package basicjavaprograms;

// %=remainder
// /=q
public class ReverseNumber {
    public static void main(String [] args) {
    	System.out.println(revNum(10134));
    }
    	public static int revNum(int num) {
    		   int rev=0,rem;
    		   while(num!=0) {
    			   rem=num%10;
    			   rev=rev*10+rem;
    			   num=num/10;
    		   }
    		   
    		   return rev;
    	   
    }
}
