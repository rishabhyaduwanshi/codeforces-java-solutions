/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codeforces_1666D
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        String a=sc.next();
	        String b=sc.next();
	        String tt=a;
	        int al=a.length();
	        int bl=b.length();
	        int qz=al;
	        Map<Character,Integer> map=new HashMap<>();//store given chars
	        Map<Character,Integer> mp=new HashMap<>();//store desired chars
	        
	        for(int j=0;j<bl;j++){
	            if(!mp.containsKey(b.charAt(j))){
	                mp.put(b.charAt(j),1);
	            }
	            else{
	                mp.put(b.charAt(j),mp.get(b.charAt(j))+1);
	            }
	        }
	       
	        for(int j=0;j<al;j++){
	            if(!map.containsKey(a.charAt(j))){
	                map.put(a.charAt(j),1);
	            }
	            else{
	                map.put(a.charAt(j),map.get(a.charAt(j))+1);
	            }
	        }
	       // System.out.println(a);
	       // System.out.println(b);
	       //  System.out.println(map);
	       // System.out.println(mp);
	       
	        for(int j=0;j<qz;j++){
	   
	            
	             if(b.equalsIgnoreCase(a)){
	             
	            //indulging an check here would not help as the check will only work if strings
	            //become equal before complition of loop but what if string become equal at final IllegalThreadStateException?
	            //peace:)
	                break;
	            }
	            if(al<bl){
	           
	                break;
	            }
	            if(b.indexOf(tt.charAt(j))==-1||map.get(tt.charAt(j))>mp.get(tt.charAt(j))){
	                if(j!=0){
	                a=a.substring(0,a.indexOf(tt.charAt(j)))+a.substring(a.indexOf(tt.charAt(j))+1);
	                }
	                else{
	                a=a.substring(a.indexOf(tt.charAt(j))+1);
	                }
	                map.put(tt.charAt(j),map.get(tt.charAt(j))-1);
	                al--;
	            }
	            
	    }
	     if(!b.equals(a)){
	                System.out.println("NO");
	                
	            }
	            else{
	                System.out.println("YES");
	            }
	    }
		// your code goes here
	}
}
