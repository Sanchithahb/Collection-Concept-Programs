package com;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(12);
		l.add(43);
		l.add(58);
		System.out.println(l); 
		l.add(1,45);
		System.out.println(l);
		l.set(2, 90);
		System.out.println(l);
	}

}
