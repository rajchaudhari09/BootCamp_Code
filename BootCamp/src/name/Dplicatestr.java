package name;

public class Dplicatestr 
{
	public static void main(String[] args)
	{
		String[] my_arr={"raj","vips","dhanu","varsha","raj"};
		for(int i=0;i<my_arr.length-1;i++)
		{
			for(int j=i+1;j<my_arr.length;j++)
			{
				if((my_arr[i].equals(my_arr[j])) && (i!=j))
				{
					System.out.println("Duplicate elemet is = " +my_arr[j]);
				}
				
			}
		}
	}
}
