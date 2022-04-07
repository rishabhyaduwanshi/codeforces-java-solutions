/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codeforces556A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String str=sc.next();
	    while(true){
	        if(str.contains("0")&&str.contains("1")){
	        if(str.contains("01")||str.contains("10")){
	            if(str.contains("01")){
	                int t=str.indexOf("01");
	                if(t!=n-2){
	                str=str.substring(0,t)+str.substring(t+2,n);
	                }
	                else if(t==0){
	                    str=str.substring(t+2,n);
	                }
	                else if(t==n-2){
	                    str=str.substring(0,t);
	                }
	                n=str.length();
	            }
	            else{
	                 int t=str.indexOf("10");
	                if(t!=n-2){
	                str=str.substring(0,t)+str.substring(t+2,n);
	                }
	                else if(t==0){
	                    str=str.substring(t+2,n);
	                }
	                else if(t==n-2){
	                    str=str.substring(0,t);
	                }
	                n=str.length();
	            }
	        }
	        else{
	            break;
	        }
	        }
	        else{
	          break;  
	        
	        }
	    }
	    System.out.println(n);
		// your code goes here
	}
}
