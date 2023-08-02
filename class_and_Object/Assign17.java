package class_and_Object;

public class Assign17 {
   /* Create a class to print an integer and a character with two methods having
   the same name but different sequence of the integer and the character parameters.

    For example, if the parameters of the first method are of the form (int n, char c),
    then that of the second method will be of the form (char c, int n).
*/
            public void integer(int n, char c){
                System.out.println("Integer= "+n+ "\t"+"char= "+c);
            } public void integer(char c, int n){
                System.out.println("char= "+c+"\t"+"Integer= "+n);
            }

    public static void main(String[] args) {
        Assign17 assign = new Assign17();
        assign.integer(10,'c');
        assign.integer('c',10);




    }
}
