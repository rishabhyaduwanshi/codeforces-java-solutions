/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt(),a1=0,b0=0;
	    String str=sc.next();
	    for(int i=0;i<t;i++){
	        if(str.charAt(i)=='0'){
	            b0=b0+1;
	        }
	        else{
	            a1=a1+1;
	        }
	    }
	    System.out.println(Math.abs(b0-a1));
		// your code goes here
	}
}
