package day2lang;

public class WindChill {
	public static void main(String args[])
	{
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double w = 35.74 + 0.6215*40 + (0.4275*40 - 35.75) * Math.pow(5, 0.16);
		System.out.println("Temperature=" + t);
		System.out.println("wind speed=" + v);
		System.out.println("wind chill=" + w);
	}

}
