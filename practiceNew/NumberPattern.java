package practiceNew;

public class NumberPattern {
    public static void main(String[] args) {
         numberPattern1(5);
        numberPattern2(5);
        numberPattern3(5);
        numberPattern4(5);
        numberPattern5(5);

    }

    private static void numberPattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /* 1
       2 2
       3 3 3
       4 4 4 4 */
    private static void numberPattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //        0
//            0 1
//            0 1 2
//            0 1 2 3
    private static void numberPattern3(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }

    private static void numberPattern4(int n) {
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
    private static void numberPattern5(int n) {
        int count = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(count-- + " ");
            }
            System.out.println();
        }
    }

}
