
import java.io.*;
import java.lang.*;

class stud
{
        String sname;
        int rno;
        float tot;                                                                                                                                   
}

class student extends stud
{

        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        float per = 0.0F;
 
        void getdata() throws IOException
        {
                System.out.println();
                System.out.print("Enter student name:");         
                sname = obj.readLine();     

                System.out.println();
                System.out.print("Enter roll no:");
                rno = Integer.parseInt(obj.readLine());    

                System.out.println();
                System.out.print("Enter total(out of 500):");
                tot = Float.parseFloat(obj.readLine());

                per = tot / 5;
           }
}

public class student_details
{
        public static void main (String[] args) throws IOException
        {                  
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
                int i,j,n;

                int merit_no = 0;
                System.out.println();
                System.out.print("Enter value of n entry:");
                n = Integer.parseInt(obj.readLine());    

                student r1[] = new student[n];
                student temp = new student();

                for (i=0 ; i <  r1.length ;  i++)
                {
                        r1[i] = new student();
                }
                for (i=0; i< r1.length; i++)
                {
                        r1[i].getdata();
                }

                for (i=0 ; i< r1.length-1  ; i++)
                {
                        for (j= i+1; j <= r1.length-1 ; j++)
                        {
                                if ( r1[i].per < r1[j].per )
                                {
                                        temp.sname = r1[i].sname ;
                                        r1[i].sname = r1[j].sname;
                                        r1[j].sname = temp.sname ;                                          
                                        temp.rno = r1[i].rno ;
                                        r1[i].rno = r1[j].rno;
                                        r1[j].rno = temp.rno ;  
                                        temp.tot = r1[i].tot ;
                                        r1[i].tot = r1[j].tot;
                                        r1[j].tot = temp.tot;  
                                        temp.per = r1[i].per ;
                                        r1[i].per = r1[j].per;
                                        r1[j].per = temp.per ;  
                                }
                        }
                }
               
                System.out.println("Name \t  No \t Total \t Percentage \t Merit");
                for (i=0 ; i < r1.length ; i++)
                {
                        merit_no++;
                        System.out.println( r1[i].sname + "\t" + r1[i].rno + "\t" + r1[i].tot  + "\t" + r1[i].per + "\t" + merit_no);                          
                }                         
        }        
}
