package collectionn.Map;

    import java.util.Scanner;
public class Ellipsis {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the numbers (enter -1 to stop):");
            int sum = add(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());

            System.out.println("Sum: " + sum);

            scanner.close();
        }

        public static int add(int... numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }
    }

