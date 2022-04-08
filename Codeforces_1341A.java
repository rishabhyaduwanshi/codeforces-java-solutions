/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1341A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt(),b=sc.nextInt(),a=sc.nextInt(),d=sc.nextInt(),c=sc.nextInt();
	        if(((b-a)*n>=d-c&&(b-a)*n<=d+c)||((a+b)*n>=d-c&&(a+b)*n<=d+c)){
	            System.out.println("YES");
	            
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
		// your code goes here
	}
}
