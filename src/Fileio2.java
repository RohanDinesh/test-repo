import java.io.*;

public class Fileio2
{
    public static void main()
    {
        File f1 = new File("f1.txt");

        try{
            if(f1.createNewFile())
            {
                System.out.println("New File Created");
                f1.renameTo(new File("abc.txt"));
                f1.delete();

            }
            else
                {
                System.out.println("Error: File not created");
            }
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        File f2 = new File("f2.txt");

        try{
            PrintWriter pw = new PrintWriter(String.valueOf(new BufferedReader(new FileReader(f2))));
            pw.println("Hello World\n This is a sample");
            pw.close();

        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        f2 = new File("f2.txt");

        try{
            BufferedReader br = new BufferedReader(new FileReader(f2));
            String text = br.readLine();


            //while(text != NULL)
            {
                System.out.println(text);
                text = br.readLine();
            }

            br.close();

        } catch (IOException fileNotFoundException)
        {
            fileNotFoundException.printStackTrace();
        }


        // catch (IOException e) {
        //    e.printStackTrace();

    }
}
