package methods;

import java.sql.SQLOutput;

public class Assign1 {
    static int getLargest(int number1,int number2,int number3){

        return (number1>number2 && number1>number3)?number1:(number2>number3 && number2>number1?number2:number3);

    }
    static int getSmallest(int number1,int number2,int number3) {

        return (number1 < number2 && number1 < number3) ? number1 : (number2 < number3 && number2 < number1 ? number2 : number3);
    }
    public static void main(String[] args) {
        System.out.println("largest number "+getLargest(30,10,20));
            System.out.println("smallest number "+getSmallest(50,30,20));



    }
}
