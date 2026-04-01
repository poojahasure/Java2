package basicjavaprograms;

public class Armstrong {
    public static void main(String [] args) {
    	int num=153;
    	if(armStrong(num)==num) {
    		System.out.println(num+" is a armstrong number");
    	}else {
    		System.out.println(num+" is a not armstrong number");
    	}
    }
    public static int armStrong(int num) {
    	int sum=0,rem;
    	
    	while(num!=0) {
    		rem=num%10;
    		sum=sum+rem *rem*rem;
    		System.out.println(sum);
    		num=num/10;
    	}
    	System.out.println(sum);
    	return sum;
    }
    
}
