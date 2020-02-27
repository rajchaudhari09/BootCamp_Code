/**
 * 
 */
/**
 * @author RAJ
 *
 */
package Database;

import java.util.Scanner;

class DB
{
	public static int  main(String args[])
	{
		int =a[10],b[20],c[30];
		Scanner sc=new Scanner(System.in);
		int m,n,p,i,j,key,val,pos,temp;
		int ch;
		do
		{
			System.out.println("-------------------------------MENU-----------------------------------");
			System.out.println("CREATE DB");
			System.out.println("DISPLAY DB");
			System.out.println("ADD RECORD");
			System.out.println("SEARCH RECORD");
			System.out.println("MODIFY RECORD");
			System.out.println("DELETE RECORD");
			System.out.println("EXIT");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("ENTER YOUR CHOICE:");
			int=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				createdb();
				break;
			case 2:
				displaydb();
				break;
			case 3:
				addrecord();
				break;
			case 4:
				searchrecord();
				break;
			case 5:
				modifyrecord();
				break;
			case 6:
				deleterecord();
				break;
			case 7:
				exit(0);
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
		while(ch!=7);
		return 0;
	}

	private static int exit(int i) 
	{
	
		return 0;	
		
	}

	private static void deleterecord() 
	{
		
		
	}

	private static void modifyrecord() 
	{
		
		
	}

	private static void searchrecord() 
	{
	
		
	}

	private static void addrecord()
	{
		
	}

	private static void displaydb()
	{
		
		
	}

	private static void createdb() 
	{
		
		
	} 
}
