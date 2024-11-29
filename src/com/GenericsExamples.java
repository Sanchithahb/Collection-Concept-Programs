package com;

import java.util.ArrayList;

public class GenericsExamples {
	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		l.add("python");
		l.add("java");
		l.add("sql");
		for(String a : l) {
			System.out.println(a);
			
		}
		System.out.println("----------------");
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(4);
		a.add(5);
		for(Integer x:a) {  //for(int x:a) it is also work.
			System.out.println(x);
			
		}
		System.out.println("----------------");
		ArrayList al = new ArrayList();
		al.add(2); //al.add(new Integer(2));
		al.add(3.4); //al.add(new Double(3.4));
		for(Object obj:al) {
			System.out.println(obj);
			
		}
		
	}

}
