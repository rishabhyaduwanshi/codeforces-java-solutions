/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_gravity_flip_405A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    for(int i=0;i<n-1;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.print(arr[n-1]);
		// your code goes here
	}
}
