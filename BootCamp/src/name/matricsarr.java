package name;

import java.util.Scanner;

public class matricsarr {
	public static void main(String args[])
	{
		int matA[][]=new int[3][3];
		int matB[][]=new int[3][3];
		int matC[][]=new int[3][3];
		int i,j;
		Scanner sc=new Scanner (System.in);
		
		///first matrix///
		System.out.println("Enter values for 1st  matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matA[i][j]=sc.nextInt();
			}
			
		}
		
		///second matrix///
		System.out.println("Enter values for 2nd  matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matB[i][j]=sc.nextInt();
			}
			
		}
		
		
		///third matrix///
		System.out.println("Enter values for 1st  matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				matC[i][j]=matA[i][j]+matB[i][j];
			}
			
		}
		System.out.println("sum of the matrix is=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(matA[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
