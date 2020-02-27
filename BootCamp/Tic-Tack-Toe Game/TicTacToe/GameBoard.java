package TicTacToe;

import java.util.Arrays;
import java.util.Scanner;

public class GameBoard 
{
	private char[][]GameBoard;
	private boolean GameonGoing=true;


	/***
	 * This is the constructor for the gameboard
	 ****/

	public GameBoard()
	{
		GameBoard =new char[3][3];


		for(int row=0;row<GameBoard.length;row++)
		{
			Arrays.fill(GameBoard[row],' ');
		}
	}/*end of constructor for GameBoard*/




	/**This method display the GameBoard to the Screen***/
	public void DisplayBoard()
	{

		for(int row=0;row<GameBoard.length;row++)
		{
			for(int col=0;col<GameBoard[0].length;col++)
			{
				System.out.print("\t"+GameBoard[row][col]);
				if(col==0 ||col==1)
					System.out.print("|");

			}
				
				if(row==0 ||row==1)
				System.out.print("\n-------------------------------\n");
		}

		System.out.println();
	}
	/***End of displayGameboard method***/


	//***This method will return true if the game is still active****//
	public boolean GameActive()
	{
		return GameonGoing; 



	}


	/***This method will ask the user to a pick a row and col, validate 
the input and call method makeMove ***/
	public void askPlayer(char player)
	{
		@SuppressWarnings("resource")
		Scanner keyboard=new Scanner(System.in);
		int row,col;
		do
		{
			System.out.printf("player %s Enter a row (1-3) ",player);
			row=keyboard.nextInt();

			System.out.printf("player %s Enter a col (1-3) ",player);
			col=keyboard.nextInt();
		}
		while(notValid(row,col));

		makeMove(player,row-1,col-1);
	}
	/**End of askPlayer method**/



	/*This method will check to see if there are 3'X'sor 'O's 
	 * in a row @ return true if there is a winnwer,false otherwise**/
	public boolean checkForWinner()
	{
		//loop over each row and check for a winner
		for(int row=0;row<GameBoard.length;row++)
		{
			if(GameBoard[row][0]==GameBoard[row][1]&&GameBoard[row][1]==GameBoard[row][2]
					&&GameBoard[row][0]!=' ')
			{
				System.out.print("The winner is"+GameBoard[row][0]);
				GameonGoing=false;
			}	
		}
		//loop over each colomn and check for a winner
		for(int col=0;col<GameBoard[0].length;col++)
		{

			if(GameBoard[0][col]==GameBoard[1][col]&&GameBoard[1][col]==GameBoard[2][col]
					&&GameBoard[0][col]!=' ')
			{
				System.out.print("The winner is"+GameBoard[0][col]);
				GameonGoing=false;
			}	
		}
		//check the crosses

		if(GameBoard[0][0]==GameBoard[1][1]&&GameBoard[1][1]==GameBoard[2][2]
				&&GameBoard[0][0]!=' ')
		{
			System.out.print("The winner is"+GameBoard[0][0]);
			GameonGoing=false;
		}	

		if(GameBoard[2][0]==GameBoard[1][1]&&GameBoard[1][1]==GameBoard[0][2]
				&&GameBoard[0][2]!=' ')
		{
			System.out.print("The winner is"+GameBoard[1][1]);
			GameonGoing=false;
		}	

		return false;
	}



	/**This method validate if therow and colomn are between 1-3**/
	public boolean notValid(int row,int col)
	{
		if(row>3||row<1||col>3||col<1||!isEmpty(row,col))
			return true;
 
		else

			return false;



	}
	/**This method will check isEmpty or not
	 * @returne true if the position is empty,false otherwise*/
	public boolean isEmpty(int row,int col)
	{
		if(GameBoard[row-1][col-1]==' ')
			return true;
		else
		{
			System.out.println("That position is taken.\n");
			return false;
		}
	}

	/**This method will validate if a players moves allowed and returne true 
	 * if the move was completed 
	 * **/


	public boolean makeMove(char player,int row,int col)
	{
		if( row>=0 && row<=2 && col>=0 && col<=2 )
		{
			if(GameBoard[row][col]!=' ')
				return false;
			else
			{
				GameBoard[row][col]=player;
				return true;
			}
		}
		else
			return false;


	}
	//**End of make move***//


}
