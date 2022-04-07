/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_div3_780C
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int k=0;k<t;k++){
	        String str=sc.next();
	        int ln=str.length(),m=0;
	        HashMap<Character,Integer> ptr=new HashMap<>();
	        for(int i=0;i<26;i++){
	            ptr.put((char)(97+i),0);
	        }
	        for(int i=0;i<ln;i++){
	            int a=ptr.get(str.charAt(i));
	            if(a==0){
	                ptr.put(str.charAt(i),++a);
	            }
	            else if(a==1){
	                m+=2;
	               for(int j=0;j<26;j++){
	            ptr.put((char)(97+j),0);
	        }
	            }
	        }
	        System.out.println(ln-m);
	    }
		// your code goes here
	}

}
