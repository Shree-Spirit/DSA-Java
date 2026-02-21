package Strings;

public class name {
    public static void main() {
        String first_name = "Shridhar";
        String last_name = "Gurav";
        String fullname = first_name + " " + last_name;
        System.out.println("My full name is :" + fullname);

        // space btwn name
        System.out.println("My full name is :" + fullname.length());
        // charAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }

}
