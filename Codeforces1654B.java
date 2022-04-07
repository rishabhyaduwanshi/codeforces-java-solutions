/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces1654B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        String str=sc.next();
	       // String temp=str;
	       // int a=0;
	       // String st=""+str.charAt(0);
	       //     String st1=st;
	       // while(str.indexOf(st1)!=str.lastIndexOf(st1)){
	       //     int tt=0;
	       //     st=""+str.charAt(tt);
	       //     st1=st;
	       // while(str.lastIndexOf(st)!=-1){
	       //      tt++;
	       //      st1=st;
	       //     st=st+str.charAt(tt);
	       //     if(str.lastIndexOf(st)==str.indexOf(st)){
	       //         break;
	       //     }
	       // }
	       // str=str.substring(str.lastIndexOf(st1));
	  
	   // }
	   while(str.indexOf(str.charAt(0))!=str.lastIndexOf(str.charAt(0))){
	       str=str.substring(1);
	   }
	    System.out.println(str);
	    }
		// your code goes here
	}
}
