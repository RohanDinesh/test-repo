import java.io.*;

public class delete {


    public static void main(String[] args)
        {
            File f1 = new File("C:\\Users\\Rohan\\Desktop\\f2.txt.docx");
            try{
                if(f1.createNewFile())
                {
                    System.out.println("file created");
                    f1.renameTo(new File("def.txt"));
                    f1.delete();

                }
                else
                {
                    System.out.println("error");
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }



            File f2 = new File("C:\\Users\\Rohan\\Desktop\\f2.txt.docx");
            try{
                PrintWriter pw = new PrintWriter(String.valueOf(new BufferedReader(new FileReader(f2))));
                pw.println("hello world");
                System.out.println(" file f2 \n");
                pw.close();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }

            f2 = new File("def.txt");
            try{
                BufferedReader br = new BufferedReader(new FileReader(f2));
                String text = br.readLine();
                System.out.println(text);

               {
                   System.out.println(text);
                   text = br.readLine();

               }

                int i;
                while((i=br.read())!=-1)
                    System.out.print((char)i);
                br.close();

                br.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            File f3 = new File("C:\\Users\\Rohan\\Desktop\\f2.txt.docx");
            FileOutputStream fos;

            try{
                fos = new FileOutputStream(f3, true);
                BufferedOutputStream bos = new BufferedOutputStream(fos);
                DataOutputStream dos = new DataOutputStream(bos);

                String name = "Rohan";
                int age = 20;
                double bal = 123456789.21;

                dos.writeUTF(name);
                dos.writeInt(age);
                dos.writeDouble(bal);
                dos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

            f3 = new File("C:\\Users\\Rohan\\Desktop\\f2.txt.docx");

            FileInputStream fin;

            try{
                fin = new FileInputStream(f3);
                BufferedInputStream bis = new BufferedInputStream(fin);
                DataInputStream dis = new DataInputStream(bis);

                System.out.println(dis.readUTF());
                System.out.println(dis.readInt());
                System.out.println(dis.readDouble());

                fin.close();


            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
