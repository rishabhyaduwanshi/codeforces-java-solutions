/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1624B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	        float m=(c+a)/(2f*b);
	        
	        if(m-(int)m==0 && m>0){
	            System.out.println("YES");
	        }
	        else{
	            m=(2f*b-c)/a;
	            if(m-(int)m==0&&m>0){
	                System.out.println("YES");
	            }
	            else{
	                m=(2f*b-a)/c;
	                if(m-(int)m==0&&m>0){
	                    System.out.println("YES");
	                }
	                else{
	                    System.out.println("NO");
	                }
	            }
	        }
	        
	    }
		// your code goes here
	}
}
