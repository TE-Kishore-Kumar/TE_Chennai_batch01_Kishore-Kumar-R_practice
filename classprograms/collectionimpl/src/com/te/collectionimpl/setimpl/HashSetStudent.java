package com.te.collectionimpl.setimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

import com.te.collectionimpl.listimpl.Student;

public class HashSetStudent {

	public static void main(String[] args) {
		
		Student student1 = new Student(10, "Kevin");
		Student student2 = new Student(80, "Vignesh");
		Student student3 = new Student(20, "Paul");
		Student student4 = new Student(7, "Stark");
		
		Set<Student> student = new HashSet<Student>();
		student.add(student1);
		student.add(student2);
		student.add(student3);
		student.add(student4);
		
		System.out.println("Before Sorting");
		Iterator<Student> itr = student.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("After Sort");
		ArrayList<Student> arrayList = new ArrayList<Student>(student);
		Collections.sort(arrayList);
		for(Student studenta : arrayList) {
			System.out.println(studenta);
		}
		
		/*CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		
		Iterator<Integer> iterator = arrayList.iterator();
		
		while(iterator.hasNext()) {
			arrayList.add(30);
			System.out.println(iterator.next());
		}*/
		
	}
}
