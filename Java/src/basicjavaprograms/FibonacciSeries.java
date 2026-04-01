package basicjavaprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1;
		for(int i=0;i<=n;i++){
			System.out.println(a);
			int temp=a+b;
			a=b;
			b=temp;
			
			
		}

	}

}
