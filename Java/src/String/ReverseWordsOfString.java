package String;

public class ReverseWordsOfString {
    public static void main(String[] args) {
    	String a="I Love Java";
    	char [] words=a.toCharArray();
         System.out.println(words);
    	for(int i=words.length-1;i>=0;i--) {
    		System.out.print(words[i]);
    	}
    	
    }
}
