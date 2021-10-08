package com.te.collectionimpl.queue;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> integers = new PriorityQueue<Integer>();
		integers.add(10);
		integers.add(1);
		integers.add(2);
		integers.add(9);
		integers.add(9);
		integers.add(4);
		
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
		System.out.println(integers.poll());
		System.out.println(integers);
	}
}
