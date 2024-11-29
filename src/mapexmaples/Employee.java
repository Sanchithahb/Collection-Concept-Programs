package mapexmaples;

class Employee implements Comparable<Employee>{
	int id;
	Employee(int id){
		this.id = id;
	}
	public String toString() {
		return "ID:"+id;
	}
	
	public int compareTo(Employee e) {
		return this.id - e.id;
	}

}
