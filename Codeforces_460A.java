/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_460A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),m=sc.nextInt();
	    int temp=n,count=0;
	    int set=0;
	   // while(temp>0){
	   //     if(temp%m==0&&temp!=set){
	   //         set=temp;
	   //         temp++;
	   //     }
	   //     temp--;
	   //     count++;
	   // }
	    System.out.println(n+(n-1)/(m-1));
		// your code goes here
	}
}
