package mapexmaples;

import java.util.Set;
import java.util.TreeMap;

public class CountyrMainClass {
	public static void main(String[] args) {
		Country c1 = new Country(10);
		Country c2 = new Country(20);
		Country c3 = new Country(30);
		
		TreeMap<Country , String> map = new TreeMap<Country , String>(new CountryPopulationComparator());
		map.put(c1,"india");
		map.put(c2, "china");
		map.put(c3, "turkey");
		
		 Set<Country> keys= map.keySet();
		 for(Country key : keys) {
			 System.out.println(key+" "+"Name:"+map.get(key));
		 }
	}

}
