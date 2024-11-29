package mapexmaples;

import java.util.Set;
import java.util.TreeMap;

public class EmployeeMainClass {
	public static void main(String[] args) {
		Employee e1 = new Employee(101);
		Employee e2 = new Employee(151);
		Employee e3 = new Employee(131);
		
		TreeMap<Employee ,String> map = new TreeMap<Employee ,String>();
		map.put(e1, "tom" );
		map.put(e2, "alex");
		map.put(e3, "sanch");
		
		Set<Employee> keys =map.keySet();
		for(Employee key : keys) {
			System.out.println(key+" "+"Name:"+map.get(key));
			
		}
		
	}

}
