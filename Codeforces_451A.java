/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_451A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt(),m=sc.nextInt();
	    int[][] arr=new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            arr[i][j]=1;
	        }
	    }
	    int count=0;
	    while(true){
	        int p=0,q=0,temp=0;
	         for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            if(arr[i][j]==1){
	                p=i;
	                q=j;
	                temp=1;
	                break;
	            }
	        }
	        if(temp==1){
	            break;
	        }
	    }
	    for(int i=0;i<m;i++){
	        arr[p][i]=0;
	    }
	    for(int i=0;i<n;i++){
	        arr[i][q]=0;
	    }
	    int check=0;
	    for(int a=0;a<n;a++){
	        for(int b=0;b<m;b++){
	            if(arr[a][b]==1){
	                check=1;
	           
	            }
	        }
	    }
	    if(check==0){
	        break;
	    }
	    check=0;
	    temp=0;
	    count++;
	    }
	    if(count%2==0){
	        System.out.println("Akshat");
	    }
	    else{
	        System.out.println("Malvika");
	    }
		// your code goes here
	}
}
