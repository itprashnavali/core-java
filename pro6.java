// Write a program that counts and display the total number of words starts from 'j' and 'J' from the given string.

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.String;

class pro6
{
        public static void main(String[] args)
        {
                try
                {
                        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println();
                        System.out.print("Enter the string : ");
                        String str = obj.readLine();

                        int cnt1=0,cnt2=0;

                        if (str.startsWith("j"))
                        {
                                cnt1 += 1;
                        }
                        else if (str.startsWith("J"))
                        {
                                cnt2 += 1;
                        }
                        else
                        {
                                System.out.println("The string is not start with j or J");
                        }
                                

                        System.out.println("The string start with j is " +cnt1);
                        System.out.println("The string start with J is " +cnt2);
                }
                catch(IOException e)
                {
                        System.out.println(e);
                }
                                                                                
        }
}
