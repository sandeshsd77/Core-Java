package practiceNew;
/*An Armstrong number of three digits is an integer
        such that the sum of the cubes of its digits is equal to the number itself*/

public class ArmstrongNumber {
    public static void main(String[] args) {
//        int number = 371;
//        System.out.println( isArmstrong(number));
        for (int i = 0; i < 10000; i++) {

            System.out.print(isArmstrong(i) ? i + " " : "");
        }
//        int temp = number;
//        int sum = 0;
//        int digit;
//
//        while (number > 0) {
//            digit = number % 10;
//            sum = sum + (digit * digit * digit);
//            number = number/10;
//        }
//        if (temp == sum){
//            System.out.println("armstrong number");
//        }
//        else {
//            System.out.println("not armstrong");
//        }

    }

    static boolean isArmstrong(int number) {
        int sum = 0;
        int temp = number;
        while (number > 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }
//        if (temp == sum){
//            System.out.println("armstrong number");
//        }
//        else {
//            System.out.println("not armstrong");
//        }
        return temp == sum;
    }

}
