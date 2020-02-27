package logicgames;
//**********AUTHOR BY RAJ CHAUDHARI***********//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwapGames 
{

	static int counter1;
	static int counter2;
	static int counter3;
	public static void main(String ar[])
	{
		BufferedReader br;
		br = new BufferedReader(new InputStreamReader(System.in));
		String s1="RAJ";
		String s2="VIPUL";
		String s3="DHANU";
		String s4="VICKY";
		String s5="ANKIT";
		String s6;
		String s7;
		String s8;
		String s9;
		String s10;
		String s11="Name is valid";
		String s12="Name is not valid";
		String s13;
		String s14="1";
		try
		{
			System.out.println("\n                    ******* WEL_COME *******");
			System.out.println("                    ****** LOGIC_GAME ******");
			System.out.println("                                    Life's=3");
			System.out.println("\nGame Instructions : Words are swapped randomly it arrange in \n                    valid name");
			System.out.println("\n1_AJR Enter a valid name:: ");
			s6=br.readLine();
			if(s1.equalsIgnoreCase(s6))
			{
				System.out.println(s11);
				counter1++;
			}
			else
			{
				System.out.println("Name is not valid");
			}
			System.out.println("\n2_PIVLU Enter a valid name:: ");
			s7=br.readLine();
			if(s2.equalsIgnoreCase(s7))
			{
				System.out.println(s11);
				counter1++;
			}
			else
			{
				System.out.println(s12);
			}
			System.out.println("\n3_HANDU Enter a valid name:: ");
			s8=br.readLine();
			if(s3.equalsIgnoreCase(s8))
			{
				System.out.println(s11);
				counter1++;
			}
			else
			{
				System.out.println(s12);
			}
			System.out.println("\n4_KCIVY Enter a valid name:: ");
			s9=br.readLine();
			if(s4.equalsIgnoreCase(s9))
			{
				System.out.println(s11);
				counter1++;
			}
			else
			{
				System.out.println(s12);
			}
			System.out.println("\n5_NKTAI Enter a valid name:: ");
			s10=br.readLine();
			if(s5.equalsIgnoreCase(s10))
			{
				System.out.println(s11);
				counter1++;
			}
			else
			{
				System.out.println(s12);
			}
			System.out.println("\n***");
			System.out.println("Your Score is ::===>"+counter1);
			System.out.println("\n***");
			System.out.println("If you want to play again this game please enter 1 else 2 :>");

			s13=br.readLine();
			if(s13.equals(s14))
			{
				System.out.println("\n                                    Life's=2");
				System.out.println("\n1_JRA Enter a valid name:: ");
				s6=br.readLine();
				if(s1.equalsIgnoreCase(s6))
				{
					System.out.println(s11);
					counter2++;
				}
				else
				{
					System.out.println("Name is not valid");
				}
				System.out.println("\n2_UVLPI Enter a valid name:: ");
				s7=br.readLine();
				if(s2.equalsIgnoreCase(s7))
				{
					System.out.println(s11);
					counter2++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n3_NAUHD Enter a valid name:: ");
				s8=br.readLine();
				if(s3.equalsIgnoreCase(s8))
				{
					System.out.println(s11);
					counter2++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n4_IKYCV Enter a valid name:: ");
				s9=br.readLine();
				if(s4.equalsIgnoreCase(s9))
				{
					System.out.println(s11);
					counter2++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n5_NITAK Enter a valid name:: ");
				s10=br.readLine();
				if(s5.equalsIgnoreCase(s10))
				{
					System.out.println(s11);
					counter2++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n***");
				System.out.println("Your Score is ::===>"+counter2);
				System.out.println("\n***");
				System.out.println("If you want to play again this game please enter 1 else 2:>");
			}


			s13=br.readLine();
			if(s13.equals(s14))
			{
				System.out.println("\n                                    Life's=1");
				System.out.println("\n1_RJA Enter a valid name:: ");
				s6=br.readLine();
				if(s1.equalsIgnoreCase(s6))
				{
					System.out.println(s11);
					counter3++;
				}
				else
				{
					System.out.println("Name is not valid");
				}
				System.out.println("\n2_LIVPU Enter a valid name:: ");
				s7=br.readLine();
				if(s2.equalsIgnoreCase(s7))
				{
					System.out.println(s11);
					counter3++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n3_NUHDA Enter a valid name:: ");
				s8=br.readLine();
				if(s3.equalsIgnoreCase(s8))
				{
					System.out.println(s11);
					counter3++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n4_KVYCI Enter a valid name:: ");
				s9=br.readLine();
				if(s4.equalsIgnoreCase(s9))
				{
					System.out.println(s11);
					counter3++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n5_KAINT Enter a valid name:: ");
				s10=br.readLine();
				if(s5.equalsIgnoreCase(s10))
				{
					System.out.println(s11);
					counter3++;
				}
				else
				{
					System.out.println(s12);
				}
				System.out.println("\n***");
				System.out.println("Your Score is ::===>"+counter3);
				System.out.println("\n***");
				System.out.println("\nYour game is over**************");
				System.out.println("********* Created by __RAJ CHAUDHARI ***");
			}
			else
			{
				System.out.println("**************Thanks for response************");
				System.out.println("********* Created by __RAJ CHAUDHARI **************");
			}
		}
		catch(IOException Ex)
		{
			System.out.println(Ex);
		}
	}
}

