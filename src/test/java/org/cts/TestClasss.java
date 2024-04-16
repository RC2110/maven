package org.cts;


public class TestClasss {
	int a;
	
	private void m2() {
		System.out.println(a);
	}
	private void m1() {
		a=10;
		System.out.println(a);
	}
		
	public static void main(String[] args) {
		TestClasss c = new TestClasss();
		c.m1(); //10
		c.m2(); //10
		
		
		TestClasss d = new TestClasss();
		d.m2(); //0
		d.m1(); //10
		
	}}
	