package defaultingsorting;

import java.util.TreeSet;

public class BeerMainClass {
	public static void main(String[] args) {
		Beer b1 = new Beer("oldmonk",200.3);
		Beer b2 = new Beer("kingfisher",100.4);
		Beer b3 = new Beer("mcb",134.2);
		
		TreeSet<Beer> t =new TreeSet<Beer>();
		t.add(b1);
		t.add(b2);
		t.add(b3);
		
		for(Beer b : t) {
			System.out.println(b);
			
		}
		
		
	}

}
