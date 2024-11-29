package defaultingsorting;

 class Person implements Comparable<Person>{
	String name;
	Person(String name){
		this.name = name;
	}
		public String toString() {
			return "name:"+name;
		}
		
		public int compareTo(Person p) {
			return this.name.compareTo(p.name);
			//return p.name.compareTo(this.name);
		}
	}
//this -> current object to be inserted.
//p -> already existing object.
// for String sorting, use compareTo() of string class.
//Ascending -> return this.name.compareTo(p.name);
//descending -> return p.name.compareTo(this.name);

