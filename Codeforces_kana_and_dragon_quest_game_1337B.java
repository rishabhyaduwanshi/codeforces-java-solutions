/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_kana_and_dragon_quest_game_1337B
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int a=sc.nextInt();
	       
	        int b=sc.nextInt();
	        int sum=0;
	        for(int j=0;j<a;j++){
	           // float temp=n/2;
	           // if(temp-(int)(temp)>=0.5){
	           // n=n-(int)(temp)+11;
	           // }
	           // else{
	           // n=n-(int)(temp)+9;
	           // }
	           // sum=sum+(int)temp;
	           if(n>20){
	           n=n/2+10;
	           }
	        }
	        for(int j=0;j<b;j++){
	            n=n-10;
	        }
	      
	        if(n>0){
	        System.out.println("NO");
	        }
	        else{
	        System.out.println("YES");
	        }
	    }
		// your code goes here
	}
}
