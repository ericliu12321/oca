//Default constructor
//If a class doesn't define a constructor, the compiler will add a default, no-arg constructor. the default constructor 
//will set all the primitive to their default value.

//if there is a user defined constructor, compiler won't supply default constructor.

class Employee {
  String name;
  int age;
  Employee(int age, String name) {
    this.age=age;
    this.name=name;
  }
}

class Office {
  public static void main(String[] args) {
    Employee emp=new Employee();   //wont compile.
  }
}
/******************************************************************************/    
//import an entire package
import graphics.*;

//packages are not hierachical
//example: java API has java.awt package, java.awt.color package, java.awt.font package.
//those are for organizing purpose, java.awt pacakage doesn't include java.awt.color or java.awt.font

import java.awt.*   
import java.awt.color.*  
import java.awt.font.*
/******************************************************************************/  
//local variable is not initalized, print it will cause error
class Office {
  public static void main(String[] args) {
    int i;
    System.out.println(i);
  }
}

//prog.java:4: error: variable i might not have been initialized
//    System.out.println(i);

/****************************************************************************/
//correct program
class Office {
  public static void main(String[] args) {
   int i;
   i = 
   3;
   i= /* 38 */ 74;  //print 74
   String name = "this"+"a /*blha*"+" test";  
   String course=//this is comment
     "Math";
    
   System.out.println(i);
  }
}
/****************************************************************************/
//array declar
int[] arr;
int arr[];

//array creation
arr = new int[10];

//arr initialization
arr[0]=1;
arr[1]=2;
arr[3]=3;

int[] anArray = {1,2,3,4,5};

class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = { {"Mr. ", "Mrs. ", "Ms. "}, {"Smith", "Jones"} };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
/****************************************************************************/
//for-each loop cannot be used to initialize or change the array element

public class Gosling { 
  public static void main(String[] args) {
     int[] arr={1,2,3,4,5};
     for (int i: arr) {
        i=1;
     }
     for (int i: arr) {
        System.out.println(i);   //1,2,3,4,5
     }     
     
  }
}


/*****************************************************************************/
public class Test { 
    static int i;
    static long l;
    static float f;
    static double d;

    
    public static void main(String args[ ])  { 
      System.out.println(i);   
      System.out.println(l);   
      System.out.println(f);   
      System.out.println(d);   
      /*
      0
      0
      0.0
      0.0
      */
    } 
} 


