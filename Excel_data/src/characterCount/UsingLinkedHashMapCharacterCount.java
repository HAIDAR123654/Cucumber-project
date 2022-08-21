package characterCount;
import java.util.*;

public class UsingLinkedHashMapCharacterCount {
	public static void logic(String s) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			if(map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else {
				map.put(s.charAt(i), 1);
			}
		}
		for(Map.Entry<Character, Integer> e: map.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
		
	}

	public static void main(String[] args) {
		String s = "Haidar";
		logic(s);

	}

}
