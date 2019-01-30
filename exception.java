/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at GFG.method2(File.java:14)
	at GFG.method1(File.java:10)
	at GFG.main(File.java:7)
*/

import java.io.*;

class GFG {
	public static void main (String[] args) {
       method1();
	}
	public static void method1() {
	    method2();
	}
	public static void method2() {	
	    String[] s={"abc","xyz"};
	    System.out.println(s[8]);
	}
}
