package Related_To_Array;

import java.util.Scanner;

public class Floyd_Triangle 
{
	@SuppressWarnings("resource")
	public static void main(String args[]){
		int n,i,c;
		int a=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows of floyd's triangle to print: ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(c=1;c<=i;c++)
			{
				System.out.print(a);
				a++;
			}
			System.out.println("\n");
			}
		}
}
