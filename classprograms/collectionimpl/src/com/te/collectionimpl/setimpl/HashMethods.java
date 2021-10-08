package com.te.collectionimpl.setimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashMethods {

	public static void main(String[] args) {
		
        Set<Integer> set = new HashSet<Integer>();
        
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(80);
        set.add(100);
        
        System.out.println("--------- For Each ---------");
        
        for(Integer integer : set) {
     	   System.out.println(integer);
        }
        
        System.out.println("----------- Iterator -------");
        
        Iterator<Integer> iterator = set.iterator();
        
        while(iterator.hasNext()) {
     	   System.out.println(iterator.next());
        }
        
        
     System.out.println("------remove(data) and remove(index) -----");
		set.remove(20);
		set.remove(30);
		System.out.println(set);
		
		System.out.println("---- set(index, data) -----");

		set.add(20);
		set.add(40);
		set.add(100);
		System.out.println(set);
        
		/*System.out.println("----- clear() ----");
		set.clear();
		System.out.println(set);*/
		
		System.out.println("---- contains(data) and containsall(object) -----");
		System.out.println(set.contains(20));
		System.out.println(set.contains(80));
		
		Set<Integer> integers = new HashSet<Integer>();
		integers.add(20);
		integers.add(40);
		System.out.println(set.containsAll(integers));
		
		
		System.out.println("isEmpty()  "+ set.isEmpty());
		System.out.println(set.removeAll(integers));
		System.out.println("after removeAll "+ set);
		
		System.out.println("--------toArray() ------");
		Object[] arr= set.toArray();
		
		System.out.println(arr);
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>(set);
		System.out.println("Before Sort " + arrayList);
		Collections.sort(arrayList);
		System.out.println(" After Sort "+ arrayList);
	}
}
