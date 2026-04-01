package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateWords {

	public static void main(String[] args) {
		String str="hi i am Pooja and i am a programmer";
		String [] words=str.split(" ");
		
		Map<String ,Integer> word_map=new HashMap<>();
		
		for(String word :words) {
			if(word_map.containsKey(word)) {
				word_map.put(word, word_map.get(word)+1);
			}
			else {
				word_map.put(word,1);
			}
		}
		
		System.out.println(word_map);
		
		Set<String> word_set= word_map.keySet();
		
		System.out.println(word_set);
		
		for(String word : word_set) {
			if(word_map.get(word)>1) {
				System.out.println(word);
			}
		}
		

	}

}
