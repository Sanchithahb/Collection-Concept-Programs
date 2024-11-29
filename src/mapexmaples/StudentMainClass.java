package mapexmaples;

import java.util.LinkedHashMap;
import java.util.Set;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1 = new Student(21);
		Student s2 = new Student(22);
		
		LinkedHashMap<Student, String> map = new LinkedHashMap<Student, String>();
		map.put(s1,"tom");
		map.put(s2, "alex");
		
		Set<Student> keys =map.keySet();
		for(Student key : keys) {
			System.out.println(key+" "+map.get(key));
		}
	}

}
