/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_Puzzles_337A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int[] arr=new int[m];
	    for(int i=0;i<m;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int p=0,q=n-1,temp=Integer.MAX_VALUE;
	    while(q<=m-1){
	        int a=arr[q]-arr[p];
	        if(a<temp){
	            temp=a;
	        }
	        p++;
	        q++;
	    }
	    System.out.println(temp);
		// your code goes here
	}
}
