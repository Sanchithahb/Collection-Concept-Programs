package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student("tom",50);
		Student s2 = new Student("alex",80);
		Student s3 = new Student("raam",30);
		Student s4 = new Student("sam",90);
		
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		
		Collections.sort(l);
		for(Student s : l) {
			System.out.println(s);
		}
		System.out.println("----------------------------");
	
		
		System.out.println("lowest marks:"+l.get(0)); //first index
		System.out.println("highest marks:"+l.get(l.size()-1));//last index 
		System.out.println("--------------------------");
		
		for(Student s : l) {
			if(s.marks>=35&&s.marks<=70) {
				System.out.println("student details between 35 to 70");
				System.out.println(s);
			}
		}
		
		
		
	}

}
