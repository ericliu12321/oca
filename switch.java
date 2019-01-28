public class Main { 
   final int x=3;
 
    public static void main(String[] args) { 
        int month = 2;
        final int flag=4;
        String monthString;
        switch (month) {
            case 1:          System.out.println("1");
                     break;
            case 2:          System.out.println("2");
                     break;
            case 3:          System.out.println("3");
                    break;
            case flag:       System.out.println("1");
                    break;
            default:  System.out.println("default");
            
        }

      } 
} 
