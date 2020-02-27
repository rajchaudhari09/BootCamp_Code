package test7;

import java.util.Scanner;

public class Fst_pos_miss_no 
{
	

		@SuppressWarnings("resource")
		public static void main(String[] args)
		{
			int n=0;
			int Fp=1;
			Scanner sc=new Scanner(System.in);
			System.out.println("::::::::::Enter the any number in arr::::::::::");
			n=sc.nextInt();
			int []arr=new int[n];
			System.out.println("Enter the value of arry List: ");
			for(int i=0;i<n;i++) 
			{
				arr[i]=sc.nextInt();
				if(arr[i]<Fp) 
					if(arr[i]==Fp) 
					{
						Fp=Fp+2;
					}
			}
			System.out.println("The First Positive Number is: "+Fp);
		}

		
}
