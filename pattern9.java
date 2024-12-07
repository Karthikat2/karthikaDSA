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
		int n=scan.nextInt();
		for(int i=1;i<=n-1;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print("*");
		    }
		    System.out.println("");
		}
		for(int k=1;k<=n;k++){
		    for(int l=1;l<=n-k+1;l++){
		        System.out.print("*");
		    }
		    System.out.println("");
		}

	}
}
