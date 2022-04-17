/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_320A
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	        String str=sc.next();
	       //for(int j=0;j<str.length();j++){
	           //if(str.contains("1")&&(str.charAt(0)==1)&&!str.contains("2")&&!str.contains("3")&&!str.contains("6")&&!str.contains("5")&&!str.contains("7")&&!str.contains("8")&&!str.contains("9")&&!str.contains("0")&&!str.contains("444")){
	           //    System.out.println("YES");
	               
	           //}
	           //else{
	           //    System.out.println("NO");
	           //}
	           int check=1;
	           for(int i=0;i<str.length();i++){
	               if(str.charAt(0)!='1'){
	                   check=0;
	                   break;
	               }
	               if(str.charAt(i)=='1'||str.charAt(i)=='4'){
	                   check=1;
	               }
	               else{
	                   check=0;
	                   break;
	               }
	           }
	           if(check==0||str.contains("444")){
	               System.out.println("NO");
	           }
	           else{
	               System.out.println("YES");
	           }
	       //        if(str.indexOf("444")!=-1){
	       //            System.out.println("NO");
	       //            break;
	       //        }
	       //        else{
	       //            System.out.println("YES");
	       //            break;
	       //        }
	       //    }
	       //    else{
	       //        System.out.println("NO");
	       //        break;
	       //    }
	       //}
	 
	       
		// your code goes here
	}
}
