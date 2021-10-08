package com.te.practice.test;

interface Driver{
	void connect();
}

class OracleDriver implements Driver{
	@Override
	public void connect() {
		System.out.println("Oracle Driver Connectig");
	}
}

class Db2Driver implements Driver{
	@Override
	public void connect() {
		System.out.println("Db2 Driver Connecting");
	}
}

class MicrosoftDriver implements Driver{
	@Override
	public void connect() {
		System.out.println("Microsoft Connecting");
	}
}
public class Interface1 {

	public static void main(String[] args) {
		
		Driver ref = new OracleDriver();
		ref.connect();
		
		ref = new Db2Driver();
		ref.connect();
		
		ref = new MicrosoftDriver();
		ref.connect();
	}
}
