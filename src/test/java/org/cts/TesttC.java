package org.cts;

public class TesttC {
	static int i=10;
	int c=2;
	private void m2() {
		System.out.println(i);

	}
	private void m1() {
		i=10;
		System.out.println(i);

	}	
	
	private int m3(int a, int b) {
		int c = a+b;
		return c;
	}
	
	private void m4(int a, int b) {
		int c = a+b;
		System.out.println(m4);
	}
	
	public static void main(String[] args) {
		TesttC c = new TesttC();
		c.m1();//10
		c.m2();//10

		TesttC d = new TesttC();
		d.m2();//10
		d.m1();//10
	}

}
