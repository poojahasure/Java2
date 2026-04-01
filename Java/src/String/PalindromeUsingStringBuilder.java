package String;

public class PalindromeUsingStringBuilder {
	 public static void main(String[] args) {
		 
	      //instantiating the StringBuilder class
	      StringBuilder sb = new StringBuilder("malayalam");
	      System.out.println("The given string: " + sb);
	      //using the reverse() method
	      StringBuilder reverse_str = sb.reverse();
	      System.out.println("The reverse the string: " + reverse_str);
	      if(("malayalam".equals(String.valueOf(reverse_str)))) {
	         System.out.println("The string is palindrome string");
	      } else {
	         System.out.println("The string is not a palindrome string");
	      }
	   }
}
