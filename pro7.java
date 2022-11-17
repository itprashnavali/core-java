
//Write a program that counts all occurences of each character in a given line

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class pro7
{
        public static void main(final String[] args) throws IOException
        {
                final BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Please enter the sentence : ");
                System.out.flush();
                final String str = obj.readLine().trim();

                final int lengthStr =  str.length();
                final String uppercase = str.toUpperCase();

                int NumA=0,NumB=0,NumC=0,NumD=0,NumE=0,NumF=0,NumG=0,NumH=0;
                int NumI=0,NumJ=0,NumK=0,NumL=0,NumM=0,NumN=0,NumO=0,NumP=0;
                int NumQ=0,NumR=0,NumS=0,NumT=0,NumU=0,NumV=0,NumW=0,NumX=0,NumY=0,NumZ=0;

                for (int i=0;i<lengthStr;i++)
                {
                        char letter = uppercase.charAt(i);

                        if(letter == 'A')
                        {
                                NumA++;
                        }
                        if(letter == 'B')
                        {
                                NumB++;
                        }
                        if(letter == 'C')
                        {
                                NumC++;
                        }
                        if(letter == 'D')
                        {
                                NumD++;
                        }
                        if(letter == 'E')
                        {
                                NumE++;
                        }
                        if(letter == 'F')
                        {
                                NumF++;
                        }
                        if(letter == 'G')
                        {
                                NumG++;
                        }
                        if(letter == 'H')
                        {
                                NumH++;
                        }
                        if(letter == 'I')
                        {
                                NumI++;
                        }
                        if(letter == 'J')
                        {
                                NumJ++;
                        }
                        if(letter == 'K')
                        {
                                NumK++;
                        }
                        if(letter == 'L')
                        {
                                NumL++;
                        }
                        if(letter == 'M')
                        {
                                NumM++;
                        }
                        if(letter == 'N')
                        {
                                NumN++;
                        }
                        if(letter == 'O')
                        {
                                NumO++;
                        }
                        if(letter == 'P')
                        {
                                NumP++;
                        }
                        if(letter == 'Q')
                        {
                                NumQ++;
                        }
                        if(letter == 'R')
                        {
                                NumR++;
                        }
                        if(letter == 'S')
                        {
                                NumS++;
                        }
                        if(letter == 'T')
                        {
                                NumT++;
                        }
                        if(letter == 'U')
                        {
                                NumU++;
                        }
                        if(letter == 'V')
                        {
                                NumV++;
                        }
                        if(letter == 'W')
                        {
                                NumW++;
                        }
                        if(letter == 'X')
                        {
                                NumX++;
                        }
                        if(letter == 'Y')
                        {
                                NumY++;
                        }
                        if(letter == 'Z')
                        {
                                NumZ++;
                        }
                        
                }

                System.out.println("A : " +NumA);
                System.out.println("B : " +NumB);
                System.out.println("C : " +NumC);
                System.out.println("D : " +NumD);
                System.out.println("E : " +NumE);
                System.out.println("F : " +NumF);
                System.out.println("G : " +NumG);
                System.out.println("H : " +NumH);
                System.out.println("I : " +NumI);
                System.out.println("J : " +NumJ);
                System.out.println("K : " +NumK);
                System.out.println("L : " +NumL);
                System.out.println("M : " +NumM);
                System.out.println("N : " +NumN);
                System.out.println("O : " +NumO);
                System.out.println("P : " +NumP);
                System.out.println("Q : " +NumQ);
                System.out.println("R : " +NumR);
                System.out.println("S : " +NumS);
                System.out.println("T : " +NumT);
                System.out.println("U : " +NumU);
                System.out.println("V : " +NumV);
                System.out.println("W : " +NumW);
                System.out.println("X : " +NumX);
                System.out.println("Y : " +NumY);
                System.out.println("Z : " +NumZ);

        }
}
