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
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		int a=n1+n2+n3;
		if(a==180){
		    System.out.println("Triangle can be formed");
		    
		}
		else{
		    System.out.println("Triangle cannot be formed");
		}
	
	}
}
