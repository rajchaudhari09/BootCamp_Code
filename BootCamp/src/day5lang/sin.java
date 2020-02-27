package day5lang;

public class sin
{
	public static void main(String[] args)
	{
		float n = 90;
		cal_sin(n);
	}

	private static void cal_sin(float n) 
	{
		float accuracy = (float) 0.0001,denominator,sinx,sinval;
		n=n*(float)(3.142/180.0);
		
		float x1 = n;
		 sinx = n;
		 
		 sinval = (float)sin(n);
		 int i= 1;
		 do{
			 denominator = 2*i*(2*i+1);
			 x1 = -x1 * n * n/ denominator;
			 sinx = sinx + x1;
			 i = i+1;
			 
		 }while(accuracy<=sinval - sinx);
		 System.out.println(sinx);
		// TODO Auto-generated method stub
		
	}

	private static float sin(float n) {
		// TODO Auto-generated method stub
		return 0;
	}



}
