package org;

import java.util.ArrayList;

public class EvenOdd {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(4);
		l.add(7);
		l.add(8);
		l.add(12);
		l.add(17);
		l.add(16);

		int evenCount=0;
		int oddCount=0;
		int sum=0;
		for (int i :l) {
			if(i%2==0) {
				evenCount++;
				sum=sum+i;
			}

			else {
				oddCount++;
			}
		}
		System.out.println("even numbercount: "+evenCount);
		System.out.println("odd numbercount: "+oddCount);
		System.out.println("sum of numbers:"+sum);


	}
}
