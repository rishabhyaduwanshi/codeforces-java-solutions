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
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt(),male=0,female=0,temp=0;
	        String str=sc.next();
	        for(int j=0;j<n-1;j++){
	            if(str.charAt(j)=='0'){
	                temp+=1;
	            }
	            if(str.charAt(j+1)=='0'){
	                temp+=1;
	            }
	        }
	       // System.out.println(str);
	       for(int j=0;j<n;j++){
	           if(str.charAt(j)=='1'){
	               female+=1;
	           }
	       }
	      male=n-female;
	      if(male>female){
	          System.out.println(temp-female);
	      }
	      else{
	          System.out.println(0);
	      }
	        
	    }
		// your code goes here
	}
}
