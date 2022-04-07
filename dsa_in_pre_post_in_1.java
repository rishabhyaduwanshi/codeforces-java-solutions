/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
class treenode{
    int data;
    treenode next;
    treenode(){
        next=null;
    }
    treenode(int data){
        this.data=data;
    }
    treenode(int data,treenode next){
        this.data=data;
        this.next=next;
    }
}
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    ArrayList<Integer> inorder=new ArrayList<Integer>();
    ArrayList<Integer> postorder=new ArrayList<Integer>();
    ArrayList<Integer> preorder=new ArrayList<Integer>();
    // void inorder(){
        
    // }
    // void postorder(){
        
    // }
    // void preorder(){
        
    // }
    void solution(treenode root){
        Stack<pair> st=new Stack<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty){
            Pair it=st.pop();
            if(it.num==1){
                pre.add(it.node.data);
                it.num++;
                st.push(it);
                if(it.node.left!=null){
                    st.push(new Pair(it.node.left,1);
                }
            }
            else if(it.num==2){
                in.add(it.node.data);
                it.num++;
                st.push(new Pair(it.node.left,1);
                if(it.node.right!=null){
                    st.push(new Pair(it.node.right,1);
                }
            }
            else{
                post.add(it.node.val);
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    LinkedList<Integer> ll=new LinkedList<>();
	    System.out.println("input the size of ll");
	    int t=sc.nextInt();
	    for(int i=0;i<t;i++){
	        ll.add(sc.nextInt());
	    }
	   // treenode tail=null;
	   // treenode head=null;
	    
	   // System.out.println("input the number of nodes");
	   // int t=sc.nextInt();
	   // System.out.println("Input the sequence and input END for break");
	   
	    
	   // String choice=sc.next();
	   // while(choice!="END"){
	   //     treenode ptr=new treenode(Integer.valueOf(choice));
	   //     start.next=ptr;
	   //     start=ptr;
	   //     choice=sc.next();
	   // }
	    
	   // Stack<Pair>
		// your code goes here
	}
}
