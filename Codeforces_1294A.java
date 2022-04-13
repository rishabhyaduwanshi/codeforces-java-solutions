/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1294A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),n=sc.nextInt();
	        double candy=((a+b+c+n)*1d)/3;
	      
	        if(candy%1==0){
	            if(a>candy||b>candy||c>candy){
	                System.out.println("NO");
	            }
	            else{
	                System.out.println("YES");
	            }
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
		// your code goes here
	}
}
