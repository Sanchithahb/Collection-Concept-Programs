package customsorting;

import java.util.Comparator;

class CarCostComparator implements Comparator<Car> {
	public int compare(Car x ,Car y) {
		return x.cost - y.cost;
		
	}

}
