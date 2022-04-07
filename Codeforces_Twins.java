/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_Twins
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),sum=0;
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	        sum=arr[i]+sum;
	    }
	    Arrays.sort(arr);
	    int temp=0;
	    int t=n-1,count=0;
	    while(temp<=sum/2){
	        temp=temp+arr[t];
	        t--;
	        count++;
	    }
	    System.out.println(count);
		// your code goes here
	}
}
