package com;

import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		//array gets created based on default initial capacity(10);
		ArrayList a = new ArrayList();
        //array gets created based on custom initial capacity(10);
		ArrayList b = new ArrayList(20);

		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);

		ArrayList y = new ArrayList(x);
		y.add(30);

		System.out.println(x);
		System.out.println(y);
	}

}
