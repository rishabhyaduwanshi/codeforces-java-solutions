/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces1472A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int w=sc.nextInt();
	        int h=sc.nextInt();
	        int n=sc.nextInt();
	        int temp=0,escape=0,o=1,p=1;
	        while(w%2==0){
	         
	          
	                temp+=1;
	                w=w/2;
	                if(Math.pow(2,temp)>=n){
	                    escape=1;
	                    break;
	                }
	        }
	        while(h%2==0&&escape==0){
	        
	          
	                temp+=1;
	                h=h/2;
	                if(Math.pow(2,temp)>=n){
	                    escape=1;
	                    break;
	                }
	        }
	        if((int)Math.pow(2,temp)>=n){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	    }
		// your code goes here
	}
}
