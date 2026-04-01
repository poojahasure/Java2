package array;

import java.util.HashSet;

public class RemoveDuplicateElementFromArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,1,2,5,6,3};
		
		HashSet<Integer> set =new HashSet<>();
		for(int num: arr) {
			set.add(num);
		}
		System.out.println(set);
	}

}
