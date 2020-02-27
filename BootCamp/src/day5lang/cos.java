package day5lang;

public class cos {
	public static void main(String[] args)
	{
		float n = 30;
		cal_cos(n);
	}

	private static void cal_cos(float n) 
	{
		float accuracy = (float) 0.0001,denominator,cosx,cosval;
		n=n*(float)(3.142/180.0);
		
		float x1 = n;
		 cosx = n;
		 
		 cosval = (float)cos(n);
		 int i= 1;
		 do{
			 denominator = 2*i*(2*i+1);
			 x1 = -x1 * n * n/ denominator;
			 cosx = cosx + x1;
			 i = i+1;
			 
		 }while(accuracy<=cosval - cosx);
		 System.out.println(cosx);
		// TODO Auto-generated method stub
		
	}

	private static float cos(float n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
