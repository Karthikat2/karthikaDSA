import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//Reverse a num
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();

	while(n>0){
	   long  ld=n%10;
	    n=n/10;
	    	System.out.print(ld)	;
	}

		
	}
}
