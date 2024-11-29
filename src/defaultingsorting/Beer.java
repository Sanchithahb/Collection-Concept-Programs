package defaultingsorting;

 class Beer implements Comparable<Beer>{
	String brand;
	Double cost;
	Beer(String brand , double cost){
		this.brand=brand;
		this.cost=cost;
	}
	public String toString() {
		return "Brand:"+brand+" cost:"+cost;
	}
	public int compareTo(Beer b) {
		//return Double.compare(this.cost,b.cost);
		return this.cost.compareTo(b.cost);
	}

}


 
 
 