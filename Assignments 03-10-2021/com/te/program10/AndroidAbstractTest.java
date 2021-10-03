package com.te.program10;

public class AndroidAbstractTest {

	public static void main(String[] args) {

		AndroidAbstract ref;
		ref = new MiuiAbstarct();
		ref.calling();
		ref.messaging();
		ref.ui();

		ref = new FunTouchOsAbstract();
		ref.calling();
		ref.messaging();
		ref.ui();

		ref = new ColorOsAbstract();
		ref.calling();
		ref.messaging();
		ref.ui();
	}
}
