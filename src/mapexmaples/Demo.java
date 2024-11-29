package mapexmaples;
//HashMap
import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(10,"hello");
		map.put("sa",23);
		map.put(23, 3.4);
		
		System.out.println(map);
		System.out.println("--------------");
		System.out.println(map.size());
		System.out.println(map.containsKey("sa"));
		System.out.println(map.containsValue(34));
		System.out.println(map.containsValue("hello"));
		System.out.println(map.get(23));
		System.out.println(map.get(100));
		System.out.println("------------------");
		
		System.out.println(map);
		map.remove(10);
		System.out.println(map);
		System.out.println("-----------------");
		
		System.out.println(map.isEmpty());
		map.clear();
		System.out.println(map);
		System.out.println(map.isEmpty());
	}

}
