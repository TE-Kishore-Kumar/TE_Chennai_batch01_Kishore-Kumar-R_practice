package com.te.collectionimpl.setimpl;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		
		treeSet.add(5);
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(0);
		treeSet.add(6);
		treeSet.add(2);
		treeSet.add(7);
		treeSet.add(8);
		treeSet.add(4);
		treeSet.add(11);
		treeSet.add(10);
		treeSet.add(9);
		
		Iterator<Integer> iterator = treeSet.iterator();
		
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		
		TreeSet<Character> ch = new TreeSet<Character>();
		ch.add('A');
		ch.add('a');
		ch.add('Z');
		ch.add('f');
		ch.add('L');
		
		System.out.println(ch);
		
		TreeSet<String> names = new TreeSet<String>();
		names.add("Boopathi");
		names.add("Rasheed");
		names.add("Kavin");
		names.add("nishant");
		names.add("Zain");
		names.add("vivek");
		names.add("lokesh");
		names.add("Kishore");
		
		System.out.println(names);
	}
}
