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
		num(1,n);
		
	}
	public static void num(int current,int n){
	    if(current>n){
	        return;
	    } System.out.println(current);
	  num(current+1,n);
	 
	}
}
