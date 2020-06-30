public class factorial {
    static int fact(int n) {

        if (n == 1 || n == 0) {
            return 1;
        }
        else
            return n * fact(n - 1);

    }


    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(3));
        System.out.println(fact(8));
        System.out.println(fact(1));
        System.out.println(fact(0));

    }
}