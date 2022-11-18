import java.io.*;
import java.lang.*;

public class pro12
{
	public static void main(String  args[])
		{
			int cnt=0 , i=0 ;
			cnt = args.length;
			
			String arr[] = new String[cnt];
			if ( cnt < 9 ||cnt % 3!=0)
			   {
				System.out.println("Invalid argument....");
				
			      }
				
			else
				{
					int n = cnt / 3;
					System.out.println("value of n...." + n);
					String arr1[] = new String[n];
					String arr2[] = new String[n];
					String arr3[] = new String[n];
					int  l=0 , m=1, o = 2;
					i = 0;
					do
					{

						arr1[i] =args[l];
						arr2[i] =args[m];
						arr3[i]=args[o];
						l = l+3;
						m=m+3;
						o = o+3;
						i++;
					}while (i < n);
						
					for ( i =0 ; i < n-1 ; i++)
						{
							for (int j = i+1; j<=n-1;j++)
								{
									if ((arr3[i].compareTo(arr3[j])) > 0 )
										{
											String temp = arr3[i];
											arr3[i] = arr3[j];
											arr3[j] = temp;
											String temp1 = arr1[i];
											arr1[i] = arr1[j];
											arr1[j] = temp1;
											String temp2 = arr2[i];
											arr2[i] = arr2[j];
											arr2[j] = temp2;	
										}
									else
									  	{
											if ((arr3[i].compareTo(arr3[j])==0))
												{
													if (arr1[i].compareTo( arr1[j]) > 0)
													  {
														String temp = arr3[i];
														arr3[i] = arr3[j];
														arr3[j] = temp;
														String temp1 = arr1[i];
														arr1[i] = arr1[j];
														arr1[j] = temp1;
														String temp2 = arr2[i];
														arr2[i] = arr2[j];
														arr2[j] = temp2;
													}
												}
										}	
										}//j loop
						}//i loop
					
					for ( i =0 ; i< n; i++)
				                   {
				                  	System.out.print(" "+arr3[i]+" "+arr1[i]+" "+arr2[i]);
						System.out.println(" ");
				                    }
                               }
}
}
			
