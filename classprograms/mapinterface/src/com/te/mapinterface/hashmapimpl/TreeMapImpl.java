package com.te.mapinterface.hashmapimpl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapImpl {

	public static void main(String[] args) {

		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		map.put("A", 10);
		map.put("K", 20);
		map.put("B", 30);
		map.put("B", 50);
		map.put("Z", 30);
		map.put("C", null);
		map.put("d", null);

		System.out.println(map);

		Set<Entry<String, Integer>> entries = map.entrySet();

		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " * " + entry.getValue());
			System.out.println(entry);
		}

		Iterator<Entry<String, Integer>> iterator = entries.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		TreeMap<Integer, String> map2 = new TreeMap();
		map2.put(121, new String("Name"));
		map2.put(12, new String("Name"));
		map2.put(21, new String("Name"));
		map2.put(11, new String("Name"));

		System.out.println(map2);

	}
}
