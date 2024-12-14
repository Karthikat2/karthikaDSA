import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//factorial of a given number
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		int fact=1;
		for(int i=1;i<=n;i++){
		    fact=fact*i;
		}
System.out.print(fact);
	}
}
