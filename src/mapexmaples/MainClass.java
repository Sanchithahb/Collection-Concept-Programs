package mapexmaples;
//LinkedHashMap
import java.util.LinkedHashMap;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(10,"apple");
		map.put(20,"samsung");
		map.put(30,"oneplus");
		
		//System.out.println(map);
		// traverse for each loop by using keySet.
		
		Set<Integer>keys = map.keySet();//10 20 30
		for(int key : keys) {
			System.out.println(key+" "+map.get(key));
			
		}
		System.out.println("===============");
		
		for(int key :map.keySet()) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
