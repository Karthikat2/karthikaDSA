import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
//kth digit and power
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		long a=scan.nextLong();
		long b=scan.nextLong();
		long n=scan.nextLong();
		long power=(long)Math.pow(a,b);
	//	 System.out.println(power);
		int count=0;
		while(power>0){
		    long d=power%10;
		    power=power/10;
		    count++;
		    if(n==count){
		        System.out.print(d);
		    }
		}
		
		
		
		
	}
}
