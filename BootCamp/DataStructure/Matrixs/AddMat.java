package Matrixs;

import java.util.Scanner;

public class AddMat
{
	public static void main(String args[])
	{
		int matA[][]=new int[3][3];
		int matB[][]=new int[3][3];
		int matC[][]=new int[3][3];
		int i,j;
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("Enter value of 1st matrix's: ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 matA[i][j]=sc.nextInt();
			 }
			 
		 }
		 
		 System.out.println("Enter value of 2nd matrix's: ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 matB[i][j]=sc.nextInt();
			 }
			 
		 }
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 matC[i][j]=matA[i][j]+matB[i][j];
			 }
			 
		 }
		 System.out.println("sum of the given matrix is: ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 System.out.print(matC[i][j]+" ");
			 }
			 System.out.println("");
			 
		 }
	}

}
