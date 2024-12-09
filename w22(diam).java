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
		int n= scan.nextInt();
	for(int i=1;i<=n;i++){
	    for(int j=1;j<=n-i;j++){
	        System.out.print(" ");
	    }
	    for(int j=1;j<=2*i-1;j++){
	        System.out.print("*");
	    }
	    System.out.println("");
	}
	for(int k=1;k<=n;k++){
	    for(int l=1;l<=k-1;l++){
	        System.out.print(" ");
	    }
	    for(int l=1;l<=(2*n)-(2*k-1);l++){
	        System.out.print("*");
	    }
	    System.out.println("");
	}

	}
}
