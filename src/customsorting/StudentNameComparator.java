package customsorting;

import java.util.Comparator;

class StudentNameComparator implements Comparator<Student> {
	public int compare(Student x , Student y) {
		return x.name.compareTo(y.name);
		
	}

}
