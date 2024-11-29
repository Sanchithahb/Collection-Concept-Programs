package generalization;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Person > l = new ArrayList<>();
		l.add(new Student());
		l.add(new Employee());
		
		
		
		for(Person p : l) {
		    if(p instanceof Student) {
		    	Student s =  (Student)p; //downcasting
		    	System.out.println("marks:"+s.marks);
		    }
		    else if(p instanceof Employee) {
		    	Employee e =  (Employee)p;
		    	System.out.println("salary:"+e.salary);
		    	
		    }
			
			
		}
	}

}
