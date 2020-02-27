package day5lang;
import java.util.Scanner;
public class Binary1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String s="";
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter Decimal No...");
		int num=s1.nextInt();
		for(i=num;i>=1;i=i/2)
		{
			if(i%2==0)
			{
			s+=0;
			}
			else
			{
			s+=1;
			}
		}
	System.out.println(num+" Binary is ");
	for(int j=s.length()-1;j>=0;j--){
		System.out.print(s.charAt(j));
	}
	}

}