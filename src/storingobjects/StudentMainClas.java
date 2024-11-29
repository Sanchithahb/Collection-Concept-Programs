package storingobjects;

import java.util.ArrayList;

public class StudentMainClas {
	public static void main(String[] args) {
		Student s1 = new Student(21,"tom");
		Student s2 = new Student(22,"alex");
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(s1); //l.add(new Student(21,"tom"));
		l.add(s2); //l.add(new Student(22,"alex"));
		
		for(Student s:l) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		
		for(int i = 0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
