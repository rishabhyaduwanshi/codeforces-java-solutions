/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1296B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int sum=0,temp=0;
	        while(true){
	            if(n/10!=0){
	          sum=sum+n-n%10;
	          n=n/10+n%10;
	            }
	            else{
	                sum=sum+n;
	                n=n/10;
	                break;
	            }
	        }
	        System.out.println(sum);
	    }
		// your code goes here
	}
}
