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
