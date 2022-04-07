/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1654A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        int n=sc.nextInt();
	        int[] arr=new int[n];
	        for(int j=0;j<n;j++){
	            arr[j]=sc.nextInt();
	        }
	        Arrays.sort(arr);
	        System.out.println(arr[n-2]+arr[n-1]);
	    }
		// your code goes here
	}
}
