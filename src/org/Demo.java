package org;

import java.util.LinkedList;

public class Demo {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		for(Integer  a:l) {  //for each loop
			System.out.println(a);
			
		}
		System.out.println("-----------------");
		for(int i = 0;i<l.size();i++) { //for loop
			System.out.println(l.get(i));
			
		}
	}

}
