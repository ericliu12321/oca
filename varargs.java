class  A {
   public int add(int... numbers)
   { 
      int result = 0; 
      for(int number: numbers)
      {
         result= result+number;  
      }  
      return result; 
   }
   
   public static void main(String[] args) {
       A a=new A();
       int r=a.add(1,2,3,4,5);
       System.out.println(r);
   }
}
