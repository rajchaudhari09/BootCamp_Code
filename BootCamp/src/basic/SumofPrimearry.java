package basic;

import java.util.Arrays;
import java.util.Vector;

public class SumofPrimearry 
{
	//main function declaration
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		System.out.println(primeSum(arr,n));
	}
	//Function to find count of prime
	static int primeSum(int arr[],int n)
	{
		//Find maximum value in the Array
		int max_val=Arrays.stream(arr).max().getAsInt();
		//USE SIEVE TO FIND ALL PRIME NO LESS
		//THAN OR EQUAL TOmax_val
		//Create a boolean array "prime[0....n]".A
		//value in prime[i] will finally be false
		//if i is not a prime,else true.
		Vector<Boolean>prime=new Vector<>(max_val + 1);
		for(int i=0;i<max_val+1;i++)
			prime.add(i,Boolean.TRUE);
		//remaining part of SIEVE	
		prime.add(0,Boolean.TRUE);
		prime.add(1,Boolean.TRUE);
		
		for(int p=2;p*p<=max_val;p++)
		{
			//if prime[p] is not changed, then
			//it is a prime
			if(prime.get(p)==true)
			{
				//update all multiples of p
				for(int i=p*2;i<=max_val;i+=p)
					prime.add(i,Boolean.FALSE);
				
			}
		}
		//sum all primes in arr[]
		int sum=0;
		for(int i=0;i<n;i++)
			if(prime.get(arr[i]))
				sum+=arr[i];
		
		return sum;
	}
}
