/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1657B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt(),B=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
	        long sum=0,temp=0;
	        long[] arr=new long[n+1];
	        arr[0]=0;
	        for(int j=1;j<=n;j++){
	           if(arr[j-1]+x<=(long)B){
	               arr[j]=arr[j-1]+x;
	              
	           }
	           else if(arr[j-1]-y<=(long)B){
	               arr[j]=arr[j-1]-y;
	           }
	            sum+=arr[j];
	        }
	       // for(int j=0;j<=n;j++){
	       //     System.out.println(arr[j]);
	       // }
	        System.out.println(sum);
	    }
		// your code goes here
	}
}
