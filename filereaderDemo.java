import java.io.FileReader;
import java.io.IOException;
class filereaderDemo{
    public static void main(String[] args)
    {
        
       try{
        FileReader fr = new FileReader("abc.txt");
        int i;
         while((i=fr.read())!=-1)
         {
            System.out.print((char)i);
         }
       }
       catch(IOException ex)
       {
         ex.printStackTrace();
       }

    }
}