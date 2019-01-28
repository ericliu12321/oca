//The continue statement skips the current iteration of a for, while , or do-while loop. 

class ContinueDemo {
    public static void main(String[] args) {

        String str = "peter piper picked a " + "peck of pickled peppers";
        int max = str.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            if (str.charAt(i) != 'p')
                continue;
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
    }
}

//A labeled continue statement skips the current iteration of an outer loop marked with the given label.
class ContinueWithLabelDemo {
    public static void main(String[] args) {

        String str = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt = false;

        int max = str.length() - substring.length();

    test:
        for (int i = 0; i <= max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (str.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt = true;
                break test;
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");
    }
}


