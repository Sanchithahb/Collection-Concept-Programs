package storingobjects;

import java.util.LinkedList;

public class CricketPlayerMainClass {
	public static void main(String[] args) {
		CricketPlayer c1 = new CricketPlayer("virat","india",100);
		CricketPlayer c2 = new CricketPlayer("sachin","india",200);
		
		LinkedList<CricketPlayer> l = new LinkedList<CricketPlayer>();
		l.add(c1);
		l.add(c2);
		
		for(CricketPlayer c : l) {
			System.out.println(c);
			
		}
		System.out.println("-----------------");
		
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
