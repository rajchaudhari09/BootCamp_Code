package name;

import java.util.Scanner;

public class p3 
{
	public static void main(String args[])
	{
		{

			int s1, s2 ,s3, flag = 0, i, j, k;
			Scanner s = new Scanner(System.in);
			System.out.println ("Enter the min no ="); 
			s1 = s.nextInt();
			System.out.println ("Enter the count no ="); 
			s2 = s.nextInt();
			System.out.println ("The prime numbers is =");
			/*for(i = s1; i <= s2; i++)
			{
				for( j = 2; j < i; j++)
				{

					if(i % j == 0)
					{
						flag = 0;
						break;
					}
					else
					{
						flag = 1;
					}

				}	
				if(flag == 1)
				{
					System.out.println(i);
				}
			}*/

			int count=0;
			
			while(count<s2)
			{
				flag=0;
				for( i = 2; i <=s1/2; i++)
				{
					if((s1%i)==0)
						flag=1;
					
				}
				if(flag==0)
				{
					System.out.println(s1+"");
					count++;
				}
				
				s1++;
			}
			

		}
		
	}
}
