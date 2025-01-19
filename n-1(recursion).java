import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Codechef
//print n-1 using recursion
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
	    } 
	  num(current+1,n);
	  System.out.println(current);
	 
	}
}
