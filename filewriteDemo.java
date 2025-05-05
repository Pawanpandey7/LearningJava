import java.io.FileWriter;
import java.io.IOException;

class filewriteDemo{
    public static void main(String[] args)
    {
        try{
            FileWriter fw = new FileWriter("random.txt");
            String str="i am coding";
            fw.write(str);
            fw.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}