//break statement terminates the innermost switch, for, while, or do-while statement
//labeled break terminates the loop with label.

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

class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] arr = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 77, 955 } };
        int key = 12;
        int i;
        int j = 0;
        boolean foundIt = false;

    OUTLOOP:
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length;
                 j++) {
                if (arr[i][j] == key) {
                    foundIt = true;
                    break OUTLOOP;
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + key + " at " + i + ", " + j);
        } else {
            System.out.println(key + " not in the array");
        }
    }
}     