/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class codeforces779A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        String str=sc.next();
	        int count=2,ans=0;
	        for(int j=0;j<n;j++){
	            if(str.charAt(j)=='1'){
	                count+=1;
	            }
	            else{
	                ans+=max(2-count,0);
	                count=0;
	            }
	        }
	        System.out.println(ans);
	    }
		// your code goes here
	}
	public static int max(int a,int b){
	    if(a>b){
	        return a;
	        
	    }
	    else{
	        return b;
	    }
	}
}
