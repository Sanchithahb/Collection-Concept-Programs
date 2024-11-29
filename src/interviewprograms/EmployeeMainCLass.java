package interviewprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMainCLass {
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(100,"tom"));
		l.add(new Employee(400,"alex"));
		l.add(new Employee(700,"sam"));
		
		System.out.println("Employee details");
		
		for(Employee e:l) {
			System.out.println(e);
			
		}
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the operation times");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("1:sort by Id\n2:sort by name:\nEnter choice:");
		int choice = sc.nextInt();
		//sc.close();
		
		switch(choice) {
		case 1:
			Collections.sort(l,new EmployeeIDComaparator() );
			for(Employee e:l) {
				System.out.println(e);
				
			}
			break;
		case 2:
			Collections.sort(l,new EmployeeNameComparator() );
			for(Employee e:l) {
				System.out.println(e);
		
		}
			break;
			default:
				System.out.println("invalid choice");
		
		
	}

}
		sc.close();
}
}
