public class Main {
    public static void main(String[] args) {

        Object object = new Object();

        System.out.println("String representation: " + object.toString());
        System.out.println("Class: " + object.getClass());
        System.out.println("Hash code: " + object.hashCode());

        Object anotherObject = new Object();

        System.out.println("\nString representation of anotherObject: " + anotherObject.toString());
        System.out.println("Are they equal?: " + object.equals(anotherObject));

        Object objectCopy = object;

        System.out.println("\nString representation of copy: " + objectCopy.toString() + "\n");
        System.out.println("Is the copy equal to the original?: " + object.equals(objectCopy));
    }
}