// Write a program that reverse the individual words

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class pro10
{
        public static void main(final String[] pArgs) throws IOException
        {
                final BufferedReader tKeyboard = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Please enter a sentence : ");

                System.out.flush();
                final String tSentence = tKeyboard.readLine();
                
                final StringTokenizer tTokens = new StringTokenizer(tSentence);
                final int tNumberOfTokens = tTokens.countTokens();

                for(int tTokenNumber = 0;tTokenNumber <= tNumberOfTokens - 1;tTokenNumber += 2)
                {
                        System.out.print(tTokens.nextToken() +" ");
                        StringBuffer tReverseWord = new StringBuffer(tTokens.nextToken());
                        tReverseWord = tReverseWord.reverse();
                        System.out.print(tReverseWord +" ");
                }
        }
}
