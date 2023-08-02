package array.ArrayDay2.charArray;

public class CharArrayDigitPresent {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', '8', 'e', 'f', '3'};
////        for (char ch :chars
////             ) {
////            if(chars>='0'&& chars<='9'){
////                System.out.println("Digit is present "+ chars[index]);
//        }
        for (int index = 0; index < chars.length; index++) {
            if (chars[index]>='0' && chars[index] <= '9') {
                System.out.println(" "+chars[index]+" Digit is present at index : " + index);
            }
        }
    }
}
