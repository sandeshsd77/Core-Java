package practice;

public class Table1to30 {
    public static void main(String[] args) {
        for (int row = 1 ; row<=10 ; row++){
            for (int column=1 ; column<=30; column++){
                System.out.print(column*row+"\t");
            }
            System.out.println();
        }
    }
}
