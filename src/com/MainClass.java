package com;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("sanchi");
		l.add(10);
		l.add(2.4);
		l.add(null);
		l.add(20);
		l.add(32.4);
		
		for(int i =0 ;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("-----------------");
		
		for(int i=l.size()-1;i>=0;i--) {
			System.out.println(l.get(i));
		}
	}

}
