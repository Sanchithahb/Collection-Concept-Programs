package sortingobject;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainClass {
	public static void main(String[] args) {
		
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student(21));
		l.add( new Student(20));
		l.add(new Student(18));
		
		//sort() calls compareTO() internally, since ArrayList is having Student
		//object,sort() calls compareTO() of Student class
		Collections.sort(l);
		for(Student s:l) {
			System.out.println(s);
			
		}
		
		
	}

}
