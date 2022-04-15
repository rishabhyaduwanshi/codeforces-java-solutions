/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public  class Codeforces_1401A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        if(a<b){
	            System.out.println(b-a);
	        }
	        else if((b+a)%2!=0){
	            System.out.println(1);
	        }
	        else{
	            System.out.println(0);
	        }
	    }
		// your code goes here
	}
}
