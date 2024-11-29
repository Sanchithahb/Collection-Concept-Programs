package com;

import java.util.ArrayList;

public class MethodExamples {
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10);
		x.add(20);

		ArrayList y = new ArrayList();
		y.addAll(x);
		y.add(30);

		System.out.println(y);
		System.out.println("-------------------------");

		System.out.println(y.containsAll(x));
		System.out.println("---------------------------");

		System.out.println(y);
		y.removeAll(x);
		System.out.println(y);

		System.out.println("**************************");

		ArrayList a = new ArrayList();
		a.add(10);
		a.add(20);

		ArrayList b = new ArrayList();
		b.add(a); 
		b.add(30);
		System.out.println(b);
		System.out.println("size:"+b.size());
	}

}

/**
 * a & b are ArrayList
 * 1) if we use a.addAll(b); --> we are adding all the elements of 1 collection 
 *  into another collection 1 by 1 sequentially. 
 *  therefore element are [10,20,30]& size is 3.
 *  
 *  2)if we use a.add(b); --> we are adding 1 collection 
 *  into another collection as a single object.
 *  therefore element are [10,20,30]& size is 2.
   **/











