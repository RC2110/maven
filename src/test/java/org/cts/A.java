package org.cts;

public class A extends StaticNonStatic {
  private void me() {
	  StaticNonStatic c= new StaticNonStatic();
	  c.m1();
	  int i2 = c.i;
	  }
  public static void main(String[] args) {
	  StaticNonStatic c= new StaticNonStatic();
	  c.m1();
}

}
