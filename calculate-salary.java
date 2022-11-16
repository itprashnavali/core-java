
import java.io.*;
import java.lang.*;

class emp
{
        String ename;
        int eno;                                                                                                                                   
}

class employee extends emp
{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
        float basic = 0.0F;                                
        double gs,ns,da,hra,pf,pt,dd;


        void getdata() throws IOException
        {

                System.out.println();
                System.out.print("Enter employee name:");
                ename = obj.readLine();     

                System.out.println();
                System.out.print("Enter employee no:");
                eno = Integer.parseInt(obj.readLine());    

                System.out.println();
                System.out.print("Enter basic:");
                basic = Float.parseFloat(obj.readLine());

                da = basic * 0.25 ;
                hra = basic * 0.32 ;
                gs = basic + da + hra ;            
                pf = (basic + da) * (12/100) ;

                if(basic <= 6000)
                {
                        pt = 60;
                }
                else if(basic > 6000 && basic <= 9000)
                {
                        pt = 90;
                }
                else
                {
                        pt = 120;
                }

                dd = pt + pf ;
                ns = gs - dd ;

        }         
        void putdata()
        {
                System.out.println("Name \t No \t Basic \t Gross_pay \t Net_pay");
                System.out.println("---------------------------------------------------------");
                System.out.println(ename + "\t" + eno + "\t" + basic  + "\t"  +  gs  +  "\t"  + ns);                          
        }

}

public class pro3
{
        public static void main (String[] arg) throws IOException
        {                  
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
                int i,n;    

                System.out.println();
                System.out.print("Enter value of n:"  );
                n = Integer.parseInt(obj.readLine());    

                employee s1[] = new employee[n];

                for (i=0 ; i <  s1.length ;  i++)
                {
                        s1[i] = new employee();

                        s1[i].getdata();
  
                        s1[i].putdata();
                }
        }                         
}        
