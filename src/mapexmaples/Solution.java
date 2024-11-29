package mapexmaples;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer> ();
		map.put("tom", 21);
		map.put("alex", 22);
		       //(keys   values)
		 Set<String> keys = map.keySet();
		 for(String key : keys) {
			 System.out.println(key+" is "+map.get(key)+" years old");
		 }
	}

}
