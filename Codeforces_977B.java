/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_977B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    String str=sc.next();
	    int p=0;
	    String out=str.substring(0,2);
	    for(int i=0;i<a-1;i++){
	        int t=0,k=0;
	        while(str.indexOf(str.substring(i,i+2),k)!=-1){
	        k=str.indexOf(str.substring(i,i+2),k)+1;
	        t++;
	        }
	        if(p<t){
	            out=str.substring(i,i+2);
	           p=t; 
	        }
	    }
	    System.out.println(out);
		// your code goes here
	}
}
