package customsorting;

import java.util.TreeSet;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21,"tom");
		Student s2 = new Student(22,"sam");
	    Student s3 = new Student(23,"alex");
	    
	    TreeSet<Student> t =new TreeSet<Student>(new StudentNameComparator());
	    //TreeSet<Student> t =new TreeSet<Student>(new StudentAgeComaparator());
	    // we can pass only one at a time.
	    //if we want pass two then create object the traverse it.(do same thing as StudentAgeComaparator)  
	    t.add(s1);
	    t.add(s2);
	    t.add(s3);
	    
	    for(Student s : t) {
	    	System.out.println(s);
	    	
	    }
		
		
		
	}

}
