package sortingobject;

import java.util.Comparator;

class EmployeeIDComparator implements Comparator<Employee>{
	public int compare(Employee x , Employee y) {
		return x.id - y.id;
	}

}
