/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_208A_Dubstep
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    String s="";
	    int ln=str.length(),i=0,flag=1;
	    while(i<ln){
	        if(i<ln-2&&str.charAt(i)=='W'&&str.charAt(i+1)=='U'&&str.charAt(i+2)=='B'){
	                        i+=3;
	                        flag=0;
	                        continue;
	        }
	        else{
	            if(flag==0&&!s.equals("")){
	                s+=" ";
	            }
	            char c=str.charAt(i);
	            s=s+Character.toString(c);
	            i++;
	            flag=1;
	        }
	    }
	    System.out.println(s);
		// your code goes here
	}
}
