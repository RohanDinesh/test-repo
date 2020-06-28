
public class sum
{
    public static int test(int... nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return sum;
    }


    public static void main(String[] args) {
        //test(5);
        System.out.println(test(5));
        //test(2,6);
        System.out.println(test(2, 0, 45, 12, 4, 65));
        System.out.println(test(1, 12, 65, 454, 648, 42, 1, 412, 21, 4, 1245, 1225, 4512, 1545, 2121, 52, 54, 15, 5, 212, 21, 2315, 454));
    }
}