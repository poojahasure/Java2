package basicjavaprograms;

public class Plaindrome {
   public static void main(String [] args) {
	   int n=1012;
	  if( revNum(n)==n) {
		  System.out.println("Number is palindrome");
	  }
	  else {
		  System.out.println("Number is not palindrome");
	  }
   }
   
   public static int revNum(int num) {
	   int rev=0;
	   while(num!=0) {
		   rev=rev*10+num%10;
		   num=num/10;
	   }
	   System.out.println("Reversed number is "+rev);
	   return rev;
   }
   
}
