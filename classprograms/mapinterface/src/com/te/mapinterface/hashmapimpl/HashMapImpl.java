package com.te.mapinterface.hashmapimpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapImpl {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("A", 10);
		map.put(null, 20);
		map.put("B", 30);
		map.put("B", 50);
		map.put(null, 30);
		map.put("C", null);
		map.put("d", null);
		
		System.out.println(map);
		
		System.out.println("--------- EntrySet ---------");
		Set<Entry<String, Integer>> entries = map.entrySet();
		
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("--------- get ----------");
		Set<String> ref = map.keySet();
		
		for (String string : ref) {
			System.out.println(map.get(string));
		}
		
		System.out.println("--------- Iterator --------");
		
		Iterator<Entry<String, Integer>> iterable = entries.iterator();
		
		System.out.println("only values");
		while (iterable.hasNext()) {
			System.out.println(iterable.next());
		}
		
		ArrayList arrayList = new ArrayList(map.keySet());
		System.out.println(arrayList);
	}
}
