//switch only works with 
//char, byte, short, int, String, enum  (4 primitive type + String, enum)
//Character, Byte, Short, Integer
//boolean is too simply, long/float/double is too complex

//multiple cases case 1: case 2: case:3
//case 1: 
//case 2: 
//case 3:

//case n:   # n has to be constant during the comiling time. 
//last case: break is optional because the code comes to the end anyway

//default doesn't have to be the last

public class Main { 
    public static void main(String[] args) { 
        int x = 2;
        final int flag=4;
        switch (x) {
            case 1:  System.out.println("1");
                     break;
//            default: System.out.println("default");
//                    break;                
            case 2:  System.out.println("2");
                     break;
            case 3:  System.out.println("3");
                     break;
            case flag: System.out.println("1");
                    break;
            default:  System.out.println("default");
                    //break;    
        }
      } 
} 
