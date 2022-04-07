/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1657A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    //it's a simple math problem which simply deals with the fact that there 
	   //can be only three most efficient methods to reach a address in address
	   //in an euclidian plain;
	   int t=sc.nextInt();
	   for(int i=0;i<t;i++){
	       int a=sc.nextInt(),b=sc.nextInt();
	       int temp=0;
	       while(temp*temp<Math.pow(a,2)+Math.pow(b,2))temp++;
	       int ans=2;
	       if(temp*temp==a*a+b*b){
	           ans=1;
	       }
	       if(temp==0){
	           ans=0;
	       }
	       System.out.println(ans);
	   }
		// your code goes here
	}
}
