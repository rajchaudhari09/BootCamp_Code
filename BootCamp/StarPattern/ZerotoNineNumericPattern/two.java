package ZerotoNineNumericPattern;

public class two 
{
	public static void main(String args[])
	{
		two Two = new two();
		Two.printStar();
		
	}
	
	public void printStar()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i<1&&j>0||i<1&&j<1||i<2&&j>1||i>2&&j<3||i>1&&j<3||i>2&&j<4||i>3&&j>1||i<3&&j>2||j>3&&i<3)
				{				System.out.print(" *");
				}else{
					System.out.print("  ");
				}
			}
			System.out.print("\n");
		}
	}	
}
