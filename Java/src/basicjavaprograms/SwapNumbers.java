package basicjavaprograms;

public class SwapNumbers {

	public static void main(String[] args) {
		int a=10,b=20;
		
		//logic-1 third variable
		System.out.println("logic 1-Before Swapping"+a+b);
//		int t=a;
//		a=b;
//		b=t;
//		System.out.println("logic 2-after Swapping"+a+b);
//		
		//logic -2 + and -
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("logic 2-after Swapping"+a+b);
//		
		//logic=3 * and /
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("logic 2-after Swapping"+a+b);
	}

}
