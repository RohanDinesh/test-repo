public class Generic {
    public static void main(String[] args)
    {
        String[] s1 = { "abc", "def","ghi","jkl","mno" } ;
        Integer[] i1 = { 12,45,32,4,35,24};

        //printarray(String[] s1);
        printarray(s1);
        printarray(i1);
    }

    public static <E> void printarray(E[] arr)
    {
        for(E x:arr)
        {
            System.out.println(x);
        }
        System.out.println("end of array\n");
    }

}
