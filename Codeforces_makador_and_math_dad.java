/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_makador_and_math_dad
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    
	    for(int i=0;i<t;i++){
	        String str="";
	        int n=sc.nextInt();
	        if(n%3==1){
	            int x=2*(n/3)+1;
	            while (1==1){
	                x--;
	                str=str+"1";
	                if(x==0){
	                    break;
	                }
	                x--;
	                str=str+"2";
	                if(x==0){
	                    break;
	                }
	            }
	        }
	        else if(n%3==2){
	            int x=2*(n/3)+1;
	            while(1==1){
	                x--;
	                str=str+"2";
	                if(x==0){
	                    break;
	                }
	                 x--;
	                str=str+"1";
	                if(x==0){
	                    break;
	                }
	            }
	        }
	        else if(n%3==0){
	             int x=2*(n/3);
	            while(1==1){
	                x--;
	                str=str+"2";
	                if(x==0){
	                    break;
	                }
	                 x--;
	                str=str+"1";
	                if(x==0){
	                    break;
	                }
	            }
	        }
	        System.out.println(str);
	    }
		// your code goes here
	}
}
