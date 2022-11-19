
// Create a user define exception which will not allow to enter string which more than 15 characters.


import java.io.*;
import java.lang.String;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;


class check extends Exception
{
        String str;
        check(String s)
        {
                str = s;
        }

        public String toString()
        {
                return ("Valid string is less than 15 characters");
        }
}

public class pro14
{
        public static void main(String args[]) throws IOException
        {

                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter string : ");
                String str=obj.readLine();

                try
                {
                        if (str.length() > 15)
                                throw new check(str);
                        else
                                System.out.println("Successfull....");
                }
                catch(check e)
                {
                        System.out.println(e);
                }
        }
}
     
