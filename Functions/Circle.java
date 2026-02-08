package Functions;

import java.util.*;

public class Circle {
    public static double Circuference(double r) {
        double result = 2 * 3.14 * r;
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle");
        double r = sc.nextDouble();
        double t = Circuference(r);
        System.out.print("Circumference of the circle is : " + t);
        sc.close();
    }

}
