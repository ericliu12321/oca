/*
top level class/interface: public or default (no private, no protected)
calss member variable, member method: public, protected, default, private
class constructor: public, protected, default, private


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
