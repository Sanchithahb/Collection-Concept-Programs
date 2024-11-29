package generalization;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Gadgets> l = new ArrayList<Gadgets>();
		l.add(new Mobile());
		l.add(new Laptop());
		
		for(Gadgets obj : l) {
			if(obj instanceof Mobile) {
		    	Mobile b =  (Mobile)obj; //downcasting
		    	b.call();
		    }
			else if(obj instanceof Laptop) {
				Laptop la =  (Laptop)obj;
				System.out.println(la.brand);
				
			}
			
		}
		
		
	}

}
