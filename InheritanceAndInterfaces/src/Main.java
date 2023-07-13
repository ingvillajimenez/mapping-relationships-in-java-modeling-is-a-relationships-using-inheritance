
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        // NOTE: The constructor is deprecated but can still be used
        Date date = new Date("5/11/2021");

        System.out.println("String representation: " + date.toString());
        System.out.println("Class: " + date.getClass());
        System.out.println("Hash code: " + date.hashCode());

        Date anotherDate = new Date("7/21/2021");

        System.out.println("\nString representation of another date: " + anotherDate.toString());
        System.out.println("Are they equal?: " + date.equals(anotherDate));

        Date dateCopy = date;

        System.out.println("\nString representation of copy: " + dateCopy.toString());
        System.out.println("Is the copy equal to the original?: " + date.equals(dateCopy));

//        String string = new String("A String");
//
//        System.out.println("String representation: " + string.toString());
//        System.out.println("Class: " + string.getClass());
//        System.out.println("Hash code: " + string.hashCode());
//
//        String anotherString = new String("Another string");
//
//        System.out.println("\nString representation of another string: " + anotherString.toString());
//        System.out.println("Are they equal?: " + string.equals(anotherString));
//
//        String stringCopy = string;
//
//        System.out.println("\nString representation of copy: " + stringCopy.toString());
//        System.out.println("Is the copy equal to the original?: " + string.equals(stringCopy));
    }
}