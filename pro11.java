
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class pro11
{
        // main method

        public static void main(final String[] pArgs) throws IOException
        {
                final BufferedReader tKeyboard = new BufferedReader(new InputStreamReader(System.in));

                // reads in a sentence.

                System.out.print("Please enter a sentence : ");
                System.out.flush();
                final String tSentence = tKeyboard.readLine().trim();

                // Calculates length of sentence.

                final int tLengthOfSentence = tSentence.length();

                // Changes all characters to upper case.

                final String tUpperCaseSentence = tSentence.toUpperCase();

                // Vowel,space & other character variables.

                int tNumOfA = 0;
                int tNumOfE = 0;
                int tNumOfI = 0;
                int tNumOfO = 0;
                int tNumOfU = 0;
                int tNumOfOtherCharacters = 0;
                int tNumOfSpaces = 0;

                for(int tLetterNum = 0;tLetterNum < tLengthOfSentence;tLetterNum++)
                {
                        char tCharacter = tUpperCaseSentence.charAt(tLetterNum);

                        if(tCharacter == 'A')
                        {
                                tNumOfA += 1;
                        }
                        else if(tCharacter == 'E')
                        {
                                tNumOfE += 1;
                        }
                        else if(tCharacter == 'I')
                        {
                                tNumOfI += 1;
                        }
                        else if(tCharacter == 'O')
                        {
                                tNumOfO += 1;
                        }
                        else if(tCharacter == 'U')
                        {
                                tNumOfU += 1;
                        }
                        else if(tCharacter == ' ')
                        {
                                tNumOfSpaces += 1;
                        }
                        else
                        {
                                tNumOfOtherCharacters += 1;
                        }
                }

                // Outputs Vowel Histogram

                System.out.print("A: ");

         // Calls iPrintStars method and passes in vowel variable.

                iPrintStars(tNumOfA);

                System.out.println();                                        
                System.out.print("E: ");
                iPrintStars(tNumOfE);

                System.out.println();
                System.out.print("I: ");
                iPrintStars(tNumOfI);

                System.out.println();
                System.out.print("O: ");
                iPrintStars(tNumOfO);

                System.out.println();
                System.out.print("U: ");
                iPrintStars(tNumOfU);

         // Outputs message & number of other characters.

                System.out.println("");
                System.out.println("Other(non-space)Characters : "+tNumOfOtherCharacters);

  //              System.out.println("");
                System.out.println("Number of spaces : "+tNumOfSpaces);
        }

        // iPrintStars method takes it an integer and prints out the corresponding number of stars.

        private static void iPrintStars(int pNumOfStars)
        {
                for(int tStar=1;tStar <= pNumOfStars;tStar++)
                {
                        System.out.print('*');
                }
        }
}
