package Matrixs;

import java.util.Scanner;

public class TransMat 
{
	public static void main(String srgs[])
	{
		int matA[][]=new int[3][3];
		int matT[][]=new int[3][3];
		
		int i,j;
		 Scanner sc=new Scanner (System.in);
		 
		 System.out.println("Enter value of the matrix : ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 matA[i][j]=sc.nextInt();
			 }
			 
		 }
		 
		
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 matT[i][j]=matA[j][i];
			 }
			 
		 }
		 System.out.println("Entered  the matrix : ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 System.out.print(matA[i][j]+" ");
			 }
			 System.out.println("");	 
		 }
		 System.out.println("Transpose of the given matrix is : ");
		 for(i=0;i<3;i++)
		 {
			 for(j=0;j<3;j++)
			 {
				 System.out.print(matT[i][j]+" ");
			 }
			 System.out.println("");
			 
		 }
	}
}
