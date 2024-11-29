package com;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> al  = new ArrayList<Integer>();
		al.add(20);
		al.add(10);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);

		System.out.println("----------------------------");

		ArrayList l = new ArrayList();
		l.add(20);
		l.add(3.5);
		l.add("java");
		System.out.println(l);
		Collections.reverse(l); // reverse is static (by calling class name).
		System.out.println(l);

	}

}
