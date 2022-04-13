/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1462C
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int tt=sc.nextInt();
	    for(int i=0;i<tt;i++){
	        int n=sc.nextInt();
	        if(n>45){
	            System.out.println(-1);
	        }
	        else{
	            int str=0,temp=1,t=9;
	            while(n!=0){
	                if(n<10&&n<=t){
	                    str=str+n*temp;
	                    n=0;
	                }
	                else{
	                    str=str+t*temp;
	                    n=n-t;
	                    t--;
	                    temp*=10;
	                }
	            }
	            System.out.println(str);
	        }
	    }
		// your code goes here
	}
}
