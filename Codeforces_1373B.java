/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1373B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        String str=sc.next();
	        int ln=str.length(),one=0,zero=0,ans=0;
	        for(int j=0;j<ln;j++){
	            if(str.charAt(j)=='1'){
	                one+=1;
	            }
	            else{
	                zero+=1;
	            }
	        }
	        if(one>zero){
	            ans=zero;
	        }
	        else{
	            ans=one;
	        }
	        if(ans%2==0){
	            System.out.println("NET");
	        }
	        else{
	            System.out.println("DA");
	        }
	    }
		// your code goes here
	}
}
