/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_Even_Odds_318a
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	     long n=sc.nextLong();
	    long k=sc.nextLong();
	    long a=n-n/2;
	    if(a>=k){
	        System.out.println(2*k-1);
	    }
	    else if(a<k){
	        System.out.println(2*(k-a));
	    }
		// your code goes here
	}
}
