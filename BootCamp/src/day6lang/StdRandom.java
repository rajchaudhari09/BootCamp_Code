package day6lang;

import java.util.Random;

public class StdRandom
{
	private static Random random;
	private static long seed;
	//static initiaizer
	static
	{
		//this is how the seed was set in java 1.4
		seed=System.currentTimeMillis();
		random=new Random(seed);
	}
	//dont instanciate
	private StdRandom()
	{

	}
	public static void setseed(long s)
	{
		seed=s;
		random=new Random(seed);
	}

	public static long getseed()
	{
		return seed;

	}
	public static double uniform()
	{
		return random.nextDouble();	
	}
	public static int uniform(int n)
	{
		if(n<=0l)throw new IllegalArgumentException("argument must be positive: "+n);
		return random.nextInt(n);	
	}
	public static long uniform(long n)
	{
		if(n<=0l)throw new IllegalArgumentException("argument must be positive: "+n);
		long r= random.nextLong();
		long m=n-1;

		if((n&m)==0L)
		{
			return r&m;
		}

		long u=r>>>1;
		while(u+m-(r=u%n)<0L)
		{
			u=random.nextLong()>>>1;
		}
		return r;
	}
	public static double random()
	{
		return uniform();
	}
	public static int uniform(int a,int b)
	{
		if((b<=a)||((long)b-a >=Integer.MAX_VALUE))
		{
			throw new IllegalArgumentException("invalid range:["+a+","+b+"]");
		}
		return a + uniform(b-a);
	}


	public static double uniform(double a,double b)
	{
		if(!(a<b))
		{
			throw new IllegalArgumentException("invalid range:["+a+","+b+"]");
		}
		return a + uniform()*(b-a);
	}

	public static boolean bernoulli(double p)
	{
		if(!(p>=0.0&&p<=1.0))
		{
			throw new IllegalArgumentException("probablity p must be between 0.0 and 1.0: "+p);
		}
		return uniform()<p;
	}

	public static boolean bernoulli()
	{

		return bernoulli(0.5);
	}	

	public static double gaussian()
	{
		double r,x,y;
		do
		{
			x=uniform(-1.0,1.0);
			y=uniform(-1.0,1.0);
			r=x*x+y*y;
		}
		while(r>=1||r==0);
		return x*Math.sqrt(-2*Math.log(r)/r);
	}
	public static double gaussian(double mu,double sigma)
	{
		return mu + sigma *gaussian();
	}

	public static int geometric(double p)
	{
		if(!(p>=0))
		{
			throw new IllegalArgumentException("probablity p must begrater than 0 : "+p);
		}
		if(!(p<=1.0))
		{
			throw new IllegalArgumentException("probablity p must begrater than 1 : "+p);
		}
		return(int)Math.ceil(Math.log(uniform())/Math.log(1.0-p));

	}
	public static int poisson(double lambda)
	{
		if(!(lambda>0.0))
		{
			throw new IllegalArgumentException("lambda must be positive : "+lambda);
		}
		if(Double.isInfinite(lambda))
		{
			throw new IllegalArgumentException("lambda must not be infinite  : "+lambda);
		}
		int k=0;
		double p=1.0;
		double expLambda=Math.exp(-lambda);

		do
		{
			k++;
			p+=uniform();
		}
		while(p >= expLambda);
		return k-1;
	}

	public static double pareto()
	{
		return pareto(1.0);
	}
	private static double pareto(double alpha)
	{
		if(!(alpha>0.0))
			throw new IllegalArgumentException("alpha must be positive  : "+alpha);
		return Math.pow(1-uniform(), -1.0/alpha)-1.0;

	}

	public static double cauchy()
	{
		return Math.tan(Math.PI*(uniform()-0.5));
	}
	
	public static int discrete(double[] probablities)
	{
		if(probablities == null) throw new IllegalArgumentException("argument array is null  : ");
		double EPSILON=1.0E-14;
		double sum=0.0;
		for(int i=0;i<probablities.length;i++)
		{
			if(!())
		}
	}
	
	
	
	public static void main(String args[])
	{
		
	}


}
