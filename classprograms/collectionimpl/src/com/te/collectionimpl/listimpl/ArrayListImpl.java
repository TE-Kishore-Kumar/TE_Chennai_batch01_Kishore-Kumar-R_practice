package com.te.collectionimpl.listimpl;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(10);
		list.add("Name");
		list.add(null);
		list.add(true);
		list.add('c');
		list.add(null);
		list.add(10);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
