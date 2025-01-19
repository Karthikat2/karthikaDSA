import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
//check given an array is palindrome or not 
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner scan=new Scanner(System.in)	;
	
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=scan.nextInt();
		    }
		    System.out.println(pali(a));
	    
	}
	public static boolean pali(int [] a){
	    int left=0;
	    int right =a.length-1;
	    while(left<right){
	       if(a[left]!=a[right]){
	           return false;
	       }
	    }return true;
	}
}
