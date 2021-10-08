package com.te.practice.work;

public class Rectangle {

	double area;
	double perimeter;
	public void rectangleArea(double l,double b) {
		this.area = l * b;
		System.out.println(area);
	}
	public void rectanglePerimeter(double l,double b) {
		this.perimeter = (2 * (l+b));
		System.out.println(perimeter);
}
}
