package com;

import java.util.ArrayList;

public class Demo {
	public static void main(String[] args) {
		ArrayList l  = new ArrayList();
		l.add(10);
		l.add(2.3);
		l.add("java");
		l.add(null);
		l.add(10);
		System.out.println(l);
		System.out.println(l.get(1)); //2.3
		System.out.println(l.size());
		System.out.println(l.contains("java"));
		System.out.println(l.contains("Java"));
		System.out.println("-----------------------");
		
		System.out.println(l);
		l.remove(1);
		System.out.println(l);
		System.out.println("------------------");
		
		System.out.println(l.isEmpty());
		l.clear();
		System.out.println(l);
		System.out.println(l.isEmpty());
		
	}

}
