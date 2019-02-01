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
	    System.out.println(s[8]);  // ArraylndexOutOfBoundsException
		
	    String s=null;
	    System.out.println(s.length());  // java.lang.NullPointerException		
	}
}

//ClassCastException
import java.util.ArrayList;
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
				       				       
				       
//checked Exception: either handle(try/catch) or throw 				       
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class MyTestMain {
	public static void main(String args[]) {
		try {
			RandomAccessFile raf = new RandomAccessFile("c:/temp/test.txt", "r");
			int size = 10;
			byte b[] = new byte[size];
			raf.readFully(b, 0, size);
			for (byte i : b) {
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not found");
			System.err.println(e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("IC Error");
			// System.err.println(e.toString());
			e.printStackTrace();
		}
	}
	public static void test() {
		
	}
}
				       
//StackOverflowError
class GFG {
	public static void main (String[] args) {
       method1();
	}
	public static void method1() {    //java.lang.StackOverflowError
	    method1();    
	}
}

//OutOfMemoryError
class GFG {
	public static void main (String[] args) {
	  int size=100000000;
      int[] arr=new int[size];
      for (int i=0; i<size; i++) {  // java.lang.OutOfMemoryError: Java heap space
          arr[i]=0;
      }
	}
}
				       
				       
