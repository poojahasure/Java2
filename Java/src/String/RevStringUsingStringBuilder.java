package String;

public class RevStringUsingStringBuilder {
	public static void main(String[] args) {
	      //instantiating the StringBuilder class
	      StringBuilder sb = new StringBuilder("TutorialsPoint");
	      
	      System.out.println("The original string before reverse: " + sb);
	      
	      //using the reverse() method
	      System.out.println("After reverse the string: " + sb.reverse());
}
}