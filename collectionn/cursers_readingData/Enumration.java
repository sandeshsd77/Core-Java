package collectionn.cursers_readingData;

import java.util.Enumeration;
import java.util.Vector;

//        enumration is interface use to read data only in forward direction only and cannot remove elements
//        has two method
//        1.hasMoreElement() -> return true or false till the time elements are there.
//        2.nextElement() -> returns next elemnt i.e object and move the curser to next element
//        it is used to read data from vector and hashtable
//        Vector class provide implementation for Enumration
//        element is method which return the object of type enumration
public class Enumration {
    public static void main(String[] args) {
        Vector vector = new Vector<>();
        vector.add(10);
        vector.add(8);
        vector.add(25);
        vector.add(78);
        vector.add(26);
        vector.add(48);
        vector.add(68);
        Enumeration enumeration = vector.elements(); // element is method which return the object of type enumration

            while (enumeration.hasMoreElements()){
                System.out.println(enumeration.nextElement());
            }

//        int size = vector.size();
//        for (int i = 0; i <size ; i++) {
//        System.out.println(enumeration.hasMoreElements());
//            System.out.println(enumeration.nextElement());
//
        }


    }
//}
