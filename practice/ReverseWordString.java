package practice;

public class ReverseWordString {
    public static void main(String[] args) {
        String str = new String("Heyy bro");
        String [] strings = str.split(" ");
        int left=0;
        int right= strings.length-1;
        while(left<right){
            String temp=strings[left];
            strings[left]=strings[right];
            strings[right]=temp;
            left++;
            right--;
        }
        for (String sr:strings) {
            System.out.print(sr+" ");
        }
    }
}
