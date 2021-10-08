package com.te.collectionimpl.listimpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class WayOfIteration {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(80);

		System.out.println("-------- For Loop --------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------- Using Foreach Loop ---------");
		
		for(Integer iterator : list) {
			System.out.println(iterator);
		}
		
		System.out.println("-------- Using Iterator --------");

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(" " + itr.next());
		}
		System.out.println();

		System.out.println("-------- Using ListIterator (Forward) --------");
		ListIterator<Integer> listIterator = list.listIterator();

		while (listIterator.hasNext()) {
			System.out.println(" " + listIterator.next());
		}
		System.out.println();

		System.out.println("-------- Using ListIterator (Backwards) --------");
		ListIterator<Integer> iterator = list.listIterator(list.size());

		while (iterator.hasPrevious()) {
			System.out.println(" " + iterator.previous());
		}
		System.out.println();
	}
}
