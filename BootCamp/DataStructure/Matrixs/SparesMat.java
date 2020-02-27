package Matrixs;

import java.util.Scanner;

public class SparesMat
{
	public static void main(String args[])
	{
		int mat[][]=new int[3][3];
		int i,j;
		int counter = 0;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Entered value for the matrix: ");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				mat[i][j]=sc.nextInt();
				if(mat[i][j]==0)
				{
					counter++;
				}
			}
			System.out.println("Entered the matrix is: ");
			
		}
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		 System.out.println("Transpose of the given matrix is : ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 System.out.print(mat[i][j]+" ");
			 }
			 System.out.println("");
			 
		 }
		if(counter>(3*3)/2)
		{
			System.out.println("The Transpose entered spares matrix: ");
		}
		else
		{
			System.out.println("The Transpose entered not spares matrix: ");
		}
	}
}
