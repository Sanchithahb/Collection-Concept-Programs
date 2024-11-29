package defaultingsorting;

 class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	Employee(int id ,String name ,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString() {
		return "ID:"+id+" "+" Name:"+name+" "+" Salary:"+salary;
	}
	
	public int compareTo(Employee e) {
		return this.name.compareTo(e.name);
		//return this.id - e.id;
		//return this.salary.compareTo(e.salary);  (make it double salary-->Double salary in data member)
	}

}
 /**
  * this -> current object to be inserted.
//e -> already existing object.
 * 
 * 1.sorting on id (int):
 * --Ascending order -> return this.id - e.id;
 * --descending order ->return e.id - this.id;
 * 
 * 2.sorting on name(String):
 * --Ascending order -> return this.name - e.name;
 * --descending order ->return e.name - this.name;
 * 
 * 3.sorting on salary(double):
 * --Ascending order -> return this.salary.compareTo(e.salary);
 * --descending order ->return e.salary.compareTo(this.salary);
  */
 
 
 
 
 
