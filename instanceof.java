//You can make a logical test as to the type of a particular object using the instanceof operator. This can save you from a runtime error owing to an improper cast. 

class X {
    String x="this is X";
}
class Y {
    String y="this is Y";
}

class A3 {
    
  public static void main(String args[]) { 
      Object[] arr = new Object[2];       

      X x=new X();
      Y y=new Y();
      arr[0]=x;
      arr[1]=y;
      
      for (Object obj: arr) {
         if (obj instanceof X) {
          System.out.println((X)obj.x);     	  
          }
      }
      System.out.println("test");
 }
}
