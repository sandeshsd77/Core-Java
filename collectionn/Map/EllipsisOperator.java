package collectionn.Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EllipsisOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = scanner.nextInt();

        List<Integer> inputs = new ArrayList<>();
        System.out.print("Enter inputs (enter -1 to stop): ");
        int input;
        while ((input = scanner.nextInt()) != -1) {
            inputs.add(input);
        }
        System.out.println(add(number1, number2, inputs));
//        scanner.close();
    }

    public static int add(int number1, int number2, List<Integer>... inputs) {
      return number1 * number2;
//        for (List<Integer> inputList : inputs) {
//            for (int input : inputList) {
//                result *= input;
//            }
        }
//        return result;
    }
//}







