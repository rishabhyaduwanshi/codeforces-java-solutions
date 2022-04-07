/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1475A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        long n=sc.nextLong();
	        long temp=0,num=1;
	        while(true){
	            
	            long p=(long)Math.pow(2,num);
	        if(n<p){
	            System.out.println("YES");
	            break;
	        }
	        if(n==p){
	            System.out.println("NO");
	            break;
	        }
	        num+=1;
	        }
	    }
		// your code goes here
	}
}
