import java.io.*;

public class fileio {
    public static void main(String[] args)
    {
        File f1 = new File("abc.txt");
        try{
            if(f1.createNewFile())
            {
                System.out.println("file created");
                f1.renameTo(new File("def.txt"));
                f1.delete();

            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
