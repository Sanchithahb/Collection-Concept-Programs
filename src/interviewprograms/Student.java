package interviewprograms;

 class Student implements Comparable<Student>{
	String name;
	int marks;
	Student(String name, int marks){
		this.name=name;
		this.marks=marks;
	}
	public String toString() {
		return name+" has scored "+marks+" marks";
	}
	@Override
	public int compareTo(Student s) {
		
		return this.marks-s.marks;
	}
	

}
