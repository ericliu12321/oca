/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 8
	at GFG.method2(File.java:14)
	at GFG.method1(File.java:10)
	at GFG.main(File.java:7)
*/
/*
  Checked Exception: java.lang.Exception other than java.lang.RuntimeException)
  public FileInputStream(File file) throws FileNotFoundException
  
  Runtime exception: subclass of java.lang.RuntimeException
    ArraylndexOutOfBoundsExcept ion
    IndexOutOfBoundsExcept ion
    ClassCastException
    IllegalArgumentException
    ArithmeticException
    NullPointerException
    NumberFormatException
  
  Error:  java.lang.Error
    StackOverf lowError
    NoClassDefFoundError
    OutOfMemoryError
    ExceptionlnlnitializerError    


 ArraylndexOutOfBoundsException: when access array 
 IndexOutOfBoundsException: When access ArrayList 
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


import java. util .ArrayList;
public class ListAccess {
   public static void main(String args[1) {
      ArrayList<Ink> inks = new ArrayList<Ink>();
      inks.add(new Colorlnk());
      inks.add(new Blacklnk());
      Ink ink = (Blacklnk) inks.get(O) ;  //Throws ClassCastException, you can check with instanceof 
    }
}
class Ink{}
class Colorlnk extends Ink{}
class Blacklnk extends Ink{}
