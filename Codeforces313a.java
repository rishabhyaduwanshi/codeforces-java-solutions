/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces313a
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    if(n>0){
	        System.out.println(n);
	    }
	    else{
	        int t=Math.abs(n);
	        String str=""+t;
	        int ln=str.length();
	        int a=Character.getNumericValue(str.charAt(ln-1)),b=Character.getNumericValue(str.charAt(ln-2));
	       String st="-";
	        if(a>b){
	            for(int i=0;i<ln-1;i++){
	                st=st+Character.getNumericValue(str.charAt(i));
	                
	            }
	        }
	        else{
	            for(int i=0;i<ln-2;i++){
	                st=st+Character.getNumericValue(str.charAt(i));
	            }
	            st=st+Character.getNumericValue(str.charAt(ln-1));
	        }
	        if(st.equals("-0")){
	            st="0";
	        }
	        System.out.println(st);
	    }
		// your code goes here
	}
}
