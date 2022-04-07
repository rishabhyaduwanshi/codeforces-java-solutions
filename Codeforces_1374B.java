/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1374B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        if(n%3!=0&&n!=1){
	            System.out.println("-1");
	        }
	        else{
	            int count=0;
	            while(true){
	                if(n%3!=0){
	                    break;
	                }
	                if(n%6==0){
	                    n=n/6;
	                }
	                else{
	                    n=n*2;
	                }
	               //if(n%3!=0){
	               
	               //}
	                count++;
	            }
	            if(n==1){
	            System.out.println(count);
	            }
	            else{
	                System.out.println("-1");
	            }
	        }
	    }
		// your code goes here
	}
}
