package com.te.program6;

public class Square {

	double area;
	double perimeter;

	public void squareArea(double side) {
		this.area = side * side;
		System.out.println(area);
	}

	public void squarePerimeter(double side) {
		this.perimeter = 4 * side;
		System.out.println(perimeter);

	}
}
