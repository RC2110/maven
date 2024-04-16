package org.cts;

public class StaticNonStatic extends TesttC {
	int i;
	static int g;
	public void m1() {
		System.out.println(this.i);
		System.out.println(super.i);
	}
	
	public static void m2() {
		StaticNonStatic c =  new StaticNonStatic();
		c.m1();
		int c2 = c.c;
		System.out.println(c2);
		
	}
	
	public static void main(String[] args) {
		StaticNonStatic c =  new StaticNonStatic();
		m2();
		
	}

}
