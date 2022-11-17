import java.io.*;
import java.lang.*;

class bank_account
{
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
        float bal = 0.0F;                                
        int acc_no;
        String name,acc_type;
 
        void getdata() throws IOException
        {
                System.out.println();
                System.out.print("Enter account no:");
                acc_no = Integer.parseInt(obj.readLine());

                System.out.println();
                System.out.print("Enter name:");         
                name = obj.readLine();

                System.out.println();
                System.out.print("Enter account type:");         
                acc_type = obj.readLine();

                System.out.println();
                System.out.print("Enter balance:");
                bal = Float.parseFloat(obj.readLine());
        }
        void deposite (float b)
        {
                bal = bal + b;
        }
        void withdraw (float b)
        {
                bal = bal - b;
        }
}
public class bank
{
        public static void main (String[] arg) throws IOException
        {                  
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)); 
                int i,j,n,accno;   
                float b = 0.0F;
                int ans = 0; 

                System.out.println();
                System.out.print("Enter value of n:");
                n = Integer.parseInt(obj.readLine());    
                bank_account b1[] = new bank_account[n];
              
                for (i=0 ; i <  b1.length ;  i++)
                {
                        b1[i] = new bank_account();
                }
                for (i=0; i< b1.length; i++)
                {
                        b1[i].getdata();
                }

                System.out.println("Press 1:For Deposite");
                System.out.println("Press 2:For Withdraw");
                ans = Integer.parseInt(obj.readLine());
               
                switch (ans)
                {
                        case 1 :
                                System.out.println("Enter acc_no:");
                                accno = Integer.parseInt (obj.readLine());
                                System.out.println("Enter balance:"  );
                                b = Float.parseFloat(obj.readLine());
        
                                for (i=0 ; i < b1.length ; i++)
                                {
                                        if (b1[i].acc_no == accno )
                                        {
                                                b1[i].deposite(b);
                                        }
                                }
                                break;
                        case 2 :
                                System.out.println("Enter acc_no:");
                                accno = Integer.parseInt(obj.readLine());
                                System.out.println("Enter balance:");
                                b = Float.parseFloat(obj.readLine());

                                for (i=0 ; i < b1.length ; i++)
                                {
                                        if  (b1[i].acc_no == accno )
                                        {
                                                if (b1[i].bal > b)
                                                b1[i].withdraw(b);
                                        }
                                }
                                break;
                                
                        default :
                                System.out.println("Invalid choice");
                }           
                System.out.println("No   Name    Type    Total     ");
                for (i=0 ; i < b1.length ; i++)
                {
                        System.out.println( b1[i].acc_no + "     " + b1[i].name + "                " +b1[i].acc_type  + "               "  +b1[i].bal );                          
                }                         
        }        

}



