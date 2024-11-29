package sortingobject;

import java.util.ArrayList;
import java.util.Collections;

class EmployeeMainClass {
	 public static void main(String[] args) {
		 ArrayList<Employee> l = new ArrayList<Employee>();
			l.add(new Employee(212));
			l.add( new Employee(202));
			l.add(new Employee(186));
			Collections.sort(l,new EmployeeIDComparator());
			for(Employee e : l) {
				System.out.println(e);
				
			}
			
	}

}
