/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_Candies_1343A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int k=2;
	        int div=(int)Math.pow(2,k)-1;
	        int x=1;
	        do{
	            div=(int)Math.pow(2,k)-1;
	            x=n/div;
	            k++;
	           
	        }
	        while(n%div!=0);
	        System.out.println(x);
	    }
		// your code goes here
	}
}
