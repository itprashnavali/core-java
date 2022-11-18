

// Write a program that calculates total number of uppercase and lowercase characters.
public class pro9
{
        static final int EOF=-1;
        public static void main(String args[]) throws java.io.IOException
        {
                int nextvalue,numupper=0,numlower=0,numother=0;
                char nextchar;

                System.out.println("Enter text : ");
                nextvalue = System.in.read();

                while(nextvalue != EOF)
                {
                        nextchar = (char) nextvalue;

                        if(Character.isUpperCase(nextchar))
                        {
                                numupper++;
                        }
                        else if(Character.isLowerCase(nextchar))
                        {
                                numlower++;
                        }
                        else
                        {
                                numother++;
                        }
                        nextvalue = System.in.read();
                }

                System.out.println("Upper : " +numupper);
                System.out.println("Lower : " +numlower);
                System.out.println("Other : " +numother);
        }
}
