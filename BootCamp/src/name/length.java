package name;

import java.util.Scanner;

public class length {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("array of index=" + arr[i]);
		for (int i1 = 0; i1 < 5; i++)
		// for(int i1=arr.length-1; i1>=0; i1--)
		{
			System.out.println("enter the array " + arr[i1]);
		}
	}

}
