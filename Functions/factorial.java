package Functions;

public class factorial {
    public static int Fact(int n) {
        int factt = 1;
        for (int i = 1; i <= n; i++) {
            factt = factt * i;

        }
        return factt;
    }

    public static void main(String[] a) {
        int n = 5;

        int r = Fact(n);
        System.out.println("factorial is : " + r);
    }

}
