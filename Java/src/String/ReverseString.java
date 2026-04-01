 package String;

public class ReverseString {
	public static void main(String [] args) {
		String str="Pooja Hasure";
		String revStr="";
		for(int i=str.length()-1;i>=0;i--) {
			revStr=revStr+str.charAt(i);
		}
		System.out.print(revStr);
	}
}
