import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan=new Scanner(System.in);
		long n=scan.nextLong();
		long first=0;
		long last=n%10;
		if(n<10){
		    System.out.print(n);
		}
		else{
		while(n>0){
		    first=n%10;
		    n=n/10;
		}

	
    System.out.print(first+last);

}
	}
}
