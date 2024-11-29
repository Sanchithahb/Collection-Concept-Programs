package defaultingsorting;

import java.util.TreeSet;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"alex",4.3);
		Employee e2 = new Employee(102,"anu",5.3);
		Employee e3 = new Employee(104,"tom",7.3);
		Employee e4 = new Employee(103,"sam",8.3);
		
		TreeSet<Employee> t =new TreeSet<Employee>();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		
		for(Employee e : t) {
			System.out.println(e);
			
		}
	}

}
