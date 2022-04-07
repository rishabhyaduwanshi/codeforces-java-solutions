/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_Keyboard_474A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    String str1="qwertyuiop";
	    String str2="asdfghjkl;";
	    String str3="zxcvbnm,./";
	    String choice=sc.next();
	    String input=sc.next();
	    
	    String output="";
	    for(int j=0;j<input.length();j++){
	        for(int i=0;i<str1.length();i++){
	           if(input.charAt(j)==str1.charAt(i)){
	               if(choice.equals("R")){
	               output=output+str1.charAt(i-1);
	               }
	               if(choice.equals("L")){
	               output=output+str1.charAt(i+1);    
	               }
	           }
	           
	        }
	        for(int i=0;i<str2.length();i++){
	           if(input.charAt(j)==str2.charAt(i)){
	               
	               if(choice.equals("R")){
	                   
	               output=output+str2.charAt(i-1);
	               }
	               if(choice.equals("L")){
	               output=output+str2.charAt(i+1);    
	               }
	           }
	           
	        }
	        for(int i=0;i<str3.length();i++){
	           if(input.charAt(j)==str3.charAt(i)){
	               if(choice.equals("R")){
	               output=output+str3.charAt(i-1);
	               }
	               if(choice.equals("L")){
	               output=output+str3.charAt(i+1);    
	               }
	           }
	           
	        }
	    }
	   
	    System.out.println(output);
		// your code goes here
	}
}
