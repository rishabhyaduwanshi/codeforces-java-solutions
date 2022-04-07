/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_kefa_and_first_steps_580a
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    int z=0,temp=0;
	   // for(int i=0;i<n-1;i++){
	   //     k=1;
	   //     for(int j=i;j<n-1;j++){
	   //          k++;
	   //         if(arr[j]>arr[j+1]){
	   //             i=i+k-1;
	   //          break;   
	   //         }
	   //     }
	   //     if(k>temp){
	   //         temp=k;
	   //     }
	   // }
	   for(int i=0;i<n-1;i++){
	       if(arr[i]>arr[i+1]){
	           z=0;
	       }
	       else{
	           z++;
	       }
	       if(z>temp){
	           temp=z;
	       }
	   }
	    System.out.println(temp+1);
		// your code goes here
	}
}
