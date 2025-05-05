import java.io.*;
public class WriteHello
{
    public static void main(String[] args)
    {try{
        FileOutputStream fr = new FileOutputStream("write.txt");
        String i = "Hello!";
        byte b[]= i.getBytes();
        fr.write(b);
        fr.close();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }

}