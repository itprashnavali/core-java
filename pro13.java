
// Create a user define exception which will not allow the user to enter any vowels.


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.lang.String;
import java.io.IOException;


class vowel extends Exception
{
        String str;
        vowel(String str1)
        {
                str=str1;
        }
        public String toString()
        {
                return ("Invalid character");
        }
}
                                
                                        

class pro13
{
        public static void main(String[] args) throws IOException
        {

                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter the string : ");
                String str = obj.readLine();
                
          
                for(int i=0;i<str.length();i++)
                {
			try
			{
                                char ch;
                                ch=str.charAt(i);
                                if(ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u')
                                {
                                        throw new vowel(str);
                                }
                        }
                        catch(vowel e)
                        {
                                System.out.println(e);
                        }
                }
        }
}

