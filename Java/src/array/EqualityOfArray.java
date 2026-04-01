package array;
import java.util.Arrays;
public class EqualityOfArray {

	public static void main(String[] args) {
		 int a1[]={1,4,7,2,4,9,5};
	      int a2[]={1,4,7,2,4,9,2};
	      
	       boolean status=Arrays.equals(a1,a2);
	       
	       if(status== true){
	           System.out.println("Arrays are equal");
	       }
	       else{
	           System.out.println("Arrays are not equal");
	       }

	}

}
