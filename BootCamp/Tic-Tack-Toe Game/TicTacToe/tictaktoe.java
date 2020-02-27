package TicTacToe;

public class tictaktoe 
{
	public static void main(String args[])
	{
		GameBoard myGame=new GameBoard();
		myGame.DisplayBoard();
		int counter=1;
		while(myGame.GameActive()&&counter<10)
		{
				if(counter%2==0)
				   myGame.askPlayer('O');
				else
					myGame.askPlayer('X');
				counter++;
				
				System.out.println("\n");
				myGame.DisplayBoard();
				myGame.checkForWinner();
				
				if(counter==10)
				{
					System.out.print("Stale mate!\n");
				}
		}
		
	}
}
