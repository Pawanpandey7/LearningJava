//Write a program to read an input string from the user and write the vowels of that string
//in VOWEL.TXT and consonants in CONSONANT. TXT.
//toLowerCase()
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
class vowcon{
    public static void main(String[] args)
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the string");
            String str = sc.nextLine();
            String str2 =str.toLowerCase();
            FileWriter fw1 = new FileWriter("vowel.txt");
            FileWriter fw2 = new FileWriter("consonent.txt");

            int str_length=str.length();

            for(int i=0;i<str_length;i++)
            {
                char t = str2.charAt(i);
                if(t=='a' || t=='e' || t=='i' || t=='o' || t=='u')
                {
                    fw1.write(t);
                }
                else{
                    fw2.write(t);
                }
                
            }
            fw1.close();
            fw2.close();
            sc.close();
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}