package array;

public class AdditionOfArrayElements {
    public static void main(String [] args) {
    	int [] a= {6,8,11,6,7,18};
    	int Target=17;
    	
    	for(int i=0;i<a.length;i++) {
    		for(int j=1;j<a.length;j++) {
    			if((a[i]+a[j])==Target) {
    				System.out.println(i+" "+j);
    	
    			}
    		}
    	}
    	
    	
    }
}
