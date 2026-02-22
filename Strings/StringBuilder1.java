package Strings;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder b = new StringBuilder("Shree");
        System.out.println(b);

        // Print Specific index
        System.out.println("String at index 1 is : " + b.charAt(1));

        // Changes in the string
        b.setCharAt(0, 'T');
        System.out.println("Changes at index 0 :" + b);

        // Inserting characters in the string
        b.insert(2, 'r');
        System.out.println("Result after inserting r character in existing string : " + b);

        // Deleting characters in the string
        b.delete(2, 3);
        System.out.println("Deleting charecter from index 2 to 3 : " + b);
    }

}
