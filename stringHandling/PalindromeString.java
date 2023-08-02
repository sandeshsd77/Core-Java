package stringHandling;

public class PalindromeString {
    public static void main(String[] args) {
        int num = 12231;
        String str = "123321";
        int[] arr = {1, 2, 3, 3, 2, 1};
//        System.out.println(isPlaindrome(num));
//        System.out.println(isPlaindrome(str));
//        System.out.println(isPlaindrome(arr));
        ispalindrome(arr);
    }


    static boolean isPlaindrome(String str) {
        if (str.length() <= 1) return true;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPlaindrome(int[] arr) {
        if (arr.length <= 1) return true;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }

    static boolean isPlaindrome(int num) {
        if (num <= 9) return true;
        int org = num;
        int rev = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }
        return rev == org;
    }

    static void ispalindrome(int arr[]) {
        if (arr.length <= 1) {
            System.out.println("this is palindrome");
        }
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {

            if (arr[first] != arr[last]) {
                System.out.println("not a palindrome");
            } else {
                System.out.println("this is a palindrome");
                break;
            }
            first++;
            last--;

        }

    }
}
