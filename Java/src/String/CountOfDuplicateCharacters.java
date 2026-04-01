package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateCharacters {
  public static void main(String [] args) {
	String str="Automation"; 
	System.out.println(str);
	char [] letters=str.toCharArray();
	System.out.println(letters);
	Map<Character,Integer> charMap= new HashMap<>();
	
	for(Character ch:letters) {
		if(charMap.containsKey(ch)) {
			charMap.put(ch, charMap.get(ch)+1);
		}
		else {
			charMap.put(ch, 1);
		}
	}
	System.out.println(charMap);//{A=1, a=1, t=2, u=1, i=1, m=1, n=1, o=2}
	
Set<Map.Entry<Character,Integer>> entrySet= charMap.entrySet();
	
	System.out.println(entrySet);
	for(Map.Entry<Character,Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey() +":"+entry.getValue());//[A=1, a=1, t=2, u=1, i=1, m=1, n=1, o=2]
		}
	}
 }
}
