
// Write a program that accepts a string and convert all characters of it in ascending and descending order.


import java.io.*;
import java.util.*;
import java.lang.String;

public class asc_desc
{
        public static void main(String args[])
        {
                try
                {
                        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                        System.out.println();
                        System.out.print("Enter the string : ");
                        String str = obj.readLine();

                        char[] content = str.toCharArray();
                        java.util.Arrays.sort(content);
                        String sorted = new String(content);

                        System.out.println("In ascending order:");
                        System.out.println(content);

                        System.out.println("In descending order:");
                        System.out.println(new StringBuffer(sorted).reverse());

                }
                catch(IOException e) {}
        }
}
