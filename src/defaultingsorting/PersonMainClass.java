package defaultingsorting;

import java.util.TreeSet;

public class PersonMainClass {
	public static void main(String[] args) {
		Person p1 = new Person("alex");
		Person p2 = new Person("tom");
		Person p3 = new Person("san");
	
	TreeSet<Person> t =new TreeSet<Person>();
	t.add(p1);
	t.add(p2);
	t.add(p3);
	
	for(Person p : t) {
		System.out.println(p);
		
	}

}
}
