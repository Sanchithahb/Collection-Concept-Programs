package customsorting;
import java.util.Comparator;
 class StudentAgeComaparator implements Comparator<Student> {
	 public int compare(Student x , Student y) {
		 return x.age - y.age;
	 }
	 
	 

}
 
 //x -> current object to be inserted
 //y -> already existing object.
