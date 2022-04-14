/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1433C
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt(),temp=0;
	        int[] arr =new int[n];
	       
	        int tempo=-1;
	        for(int j=0;j<n;j++){
	            arr[j]=sc.nextInt();
	            
	            if(arr[j]>temp){
	                temp=arr[j];
	               
	            }
	        }
	        for(int j=0;j<n;j++){
	            if(arr[j]!=temp)continue;
	            if(j>0&&arr[j-1]!=temp) tempo=j+1;
	            if(j<n-1&&arr[j+1]!=temp) tempo=j+1;
	        }
	        System.out.println(tempo);
	        
	    }
		// your code goes here
	}
}
