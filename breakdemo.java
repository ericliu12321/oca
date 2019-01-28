class BreakDemo {
    public static void main(String[] args) {

        int[] arr = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int key = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + key + " at index " + i);
        } else {
            System.out.println(key + " not in the array");
        }
    }
}  
     