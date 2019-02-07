/*
--- public,proteted,default,private
class/interface: public or default (no private, no protected)
calss member variable, member method: public, protected, default, private
class constructor: public, protected, default, private

--- abstract, static, final
Class:
abstract class: has to be extended, cannot create instance obj from it
final class: cannot be extended
*** static: never applied to top level class/interface

Method:
abstract method: doesn't have body{}, has to be implemented by subclass
final method: method cannot be overriden
*** static method: must have a body {}, cannot be abastract, can only access static var, no polymorph

Variable:
*** abastract: not applicable (doesn't make sense)
final: can be assigned only once (either directly or in the init block or constructor, no regular method)
static: class variable

*/

//private constructor: constructor chain, singleton class
class MySingleton 
{ 
    static MySingleton instance = null; 
    public int x = 10; 
    
    private MySingleton() {  } 
   
    // Factory method to provide the users with instances 
    static public MySingleton getInstance() 
    { 
        if (instance == null)         
             instance = new MySingleton(); 
   
        return instance; 
    }  
    public static void main(String[] args){
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        MySingleton c=MySingleton.getInstance();        
        if (b==c) {
        System.out.println("Good");
        } else {
        System.out.println("Bad");
        }
    }
} 





/* static method overridden */
class A { 
   public static void display() { 
        System.out.println("Class method from A"); 
    } 
  
   public void print()  { 
         System.out.println("Instance method from A"); 
    } 
} 
  

class B extends A { 
    public static void display() { 
         System.out.println("Static or class method from BBB"); 
    } 
      
    public void print() { 
         System.out.println("Non-static or Instance method BBB"); 
   } 
} 
  
public class Test { 
    public static void main(String args[ ])  { 
       A obj1 = new B(); 
       obj1.display();   
       obj1.print();  
       
      // B tempobj=(B) obj1;
      // tempobj.display();
       
       System.out.println("\n");
       B obj2=new B();
       obj2.display();
       obj2.print();
    } 
} 





//static innner class
public class Outer {
   static class Nested_Demo {
      public void my_method() {
         System.out.println("This is my nested class");
      }
   }
   public static void main(String args[]) {
      Outer.Nested_Demo nested = new Outer.Nested_Demo();
      nested.my_method();
   }
}
