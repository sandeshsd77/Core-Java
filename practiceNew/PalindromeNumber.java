package practiceNew;

public class PalindromeNumber {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            System.out.print((isPalindrome(i) ? i + " " : ""));
        }
//        System.out.println();
    }

    static boolean isPalindrome(int num) {
        if (num <= 9) return true;
        int org = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse == org;
    }
}
