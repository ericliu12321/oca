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
//////////////////////////////////////  Checked Exception ///////////////////////////////////////////////	
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

//////////////////////////////////////  RuntimeException ///////////////////////////////////////////////	

//IndexOutOfBoundsException, ArraylndexOutOfBoundsException, NullPointerException
import java.util.*;

class GFG {
	public static void main (String[] args) {
	    String[] s={"abc","xyz"};
	    //System.out.println(s[8]);  // ArraylndexOutOfBoundsException
		
	    String s1=null;
	    //System.out.println(s1.length());  // java.lang.NullPointerException		
		
	    ArrayList<String> arr=new ArrayList<String>();
	    arr.add("str0");
	    //System.out.println(arr.get(1));  //IndexOutOfBoundsException
	    
	    int i=3/0;
	    System.out.println(i);  //java.lang.ArithmeticException: / by zero
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

//NumberFormatException			       		       
class GFG {
	public static void main (String[] args) {
	    int num=Integer.parseInt("10d"); //ava.lang.NumberFormatException: For input string: "10d"
	    System.out.println(num);
	}
}	       

				       
//////////////////////////////////////  Error ///////////////////////////////////////////////					       
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
		       
//Exception in thread "main" java.lang.NoClassDefFoundError: Student				    
//compile these 2 classes, then remove Student.class			       
public class MyTestMain {
	public static void main(String args[]) {
		Student s = new Student();
		System.out.println(s.age);
	}
}
public class Student {
	int age=18;
}
				       
/////////////////////////////////////////////
//Exception in thread "main" java.lang.RuntimeException: i has to be less than 3
//	at MyTestMain.main(MyTestMain.java:7)

public class MyTestMain {
	public static void main(String args[])  /* throws RuntimeException*/ {
		  int i = 4;
	      if (i<=3)
		    System.out.println("this is a test");  
		  else
		   throw new RuntimeException("i has to be less than 3"); 		
	}
}

//defined checked exception, has to be throws in method definition.				       
import java.io.IOException;

public class MyTestMain {
	public static void main(String args[]) throws IOException {
		  int i = 4;
	      if (i<=3)
		    System.out.println("this is a test");  
		  else
		   throw new IOException("My IO Exception");	
	}
}				       
				       
				       
//throw NullPointerException				       
class Test 
{ 
    static void fun() 
    { 
        try
        { 
            throw new NullPointerException("demo"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught inside fun()."); 
            throw e; 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        try
        { 
            fun(); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.println("Caught in main."); 
        } 
    } 
} 
				       
				       
