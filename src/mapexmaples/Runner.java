package mapexmaples;

import java.util.Set;
import java.util.TreeMap;

public class Runner {
	public static void main(String[] args) {
		TreeMap<Double , String> map = new TreeMap<Double , String>();
		map.put(6.2, "san");
		map.put(3.2, "tom");
		map.put(5.4, "alex");
		
	    Set<Double> keys = map.keySet();
	    for(double key : keys) {
	    	System.out.println(key+" "+map.get(key));
	    	
	    }
	}

}
