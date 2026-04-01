package String;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String str="hsaudhu65432@#$:L";
		String newstr=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newstr);

	}

}
