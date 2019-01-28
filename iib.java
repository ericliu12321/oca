//The Java compiler copies initializer blocks into every constructor. Therefore, this approach can be used to share a block of code between multiple constructors.
//initialization block will execute before constructor

class GFG
{ 
   static int i;

    static { 
        i = 10; 
        System.out.println("static block called -------"); 
    } 

    {  
        System.out.println("IIB1 block"); 
    } 
      
    { 
        System.out.println("IIB2 block"); 
    } 
      
    GFG() //contructor
    { 
        System.out.println("Constructor Called"); 
    } 
    { 
        System.out.println("IIB3 block"); 
    } 
      
    public static void main(String[] args) 
    { 
        GFG a1 = new GFG(); 
		GFG a2 = new GFG();
    } 
} 
